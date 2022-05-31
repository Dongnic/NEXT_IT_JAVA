package ch16_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatServer {

	private ArrayList<Client> clientList = new ArrayList<>();

	public void serverStart() {
		try {
			ServerSocket server = new ServerSocket(9002);

			while (true) {

				Socket soc = server.accept();
				System.out.println("클라이언트 요청 수락");

				Client client = new Client(soc);
				client.start();

				clientList.add(client);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	public class Client extends Thread {
		Socket soc;
		PrintWriter writer;
		String name;

		public Client(Socket soc) {
			this.soc = soc;
			try {
				writer = new PrintWriter(soc.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		public void sendAll(String msg) {
			for (int i = 0; i < clientList.size(); i++) {
				clientList.get(i).writer.println(msg);
				clientList.get(i).writer.flush();
			}
		}

		@Override
		public void run() {
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));

				name = reader.readLine();
				sendAll(name + "님이 입장하셨습니다");

				while (true) {
					String msg = reader.readLine();
					if (msg == null || msg.isEmpty()) {
						break;
					}
					sendAll(name + ": " + msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				sendAll(name + "님이 퇴장하셨습니다");
				clientList.remove(this);
				if (soc != null)
					try {
						soc.close();
					} catch (IOException e) {
					}
			}
		}

	}

}

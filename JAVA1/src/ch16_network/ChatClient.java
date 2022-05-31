package ch16_network;

import java.io.IOException;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		
		try {
			Socket soc = new Socket("192.168.0.29"
					+ "", 9002);
			System.out.println("접속 성공");
			System.out.println(soc.getRemoteSocketAddress());
			
			// 데이터 송수신 
			SendThread send = new SendThread(soc, "익명");
			ReceiveThread receive = new ReceiveThread(soc);
			while(1<2) {
			send.start();
			receive.start();
			}
						
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

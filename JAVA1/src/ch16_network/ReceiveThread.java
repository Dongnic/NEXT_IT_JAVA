package ch16_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread{
	private Socket soc;
	
	public ReceiveThread(Socket soc) {
		super();
		this.soc = soc;
	}

	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			
			while(true) {
				String msg = reader.readLine();
				if(msg == null || msg.isEmpty()) {
					break;
				}
				System.out.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(soc != null) try {soc.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}
}

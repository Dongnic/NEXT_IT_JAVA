package ch16_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread{
	
	private Socket soc;
	private String name;
	
	
	public SendThread() {
		
	}
	
	public SendThread(Socket soc, String name) {
		super();
		this.soc = soc;
		this.name = name;
	}



	@Override
	public void run() {
		// 키보드 -> 소켓 데이터 전송
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			PrintWriter writer = new PrintWriter(soc.getOutputStream());
			
			// 닉네임 전송
			writer.println(name);
			writer.flush();
			
			while(1<2) {
				System.out.println();
				System.out.print("입력: ");
				String msg = reader.readLine();
				// 채팅 종료
				if(msg == null || msg.equals("")) {
					break;
				}
				
				writer.println(msg);
				writer.flush();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(soc != null) try {soc.close();} catch (IOException e) {e.printStackTrace();}
		}
	}
	
}

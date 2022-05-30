package ch15_inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {

	public static void main(String[] args) {
		String filePath = "/home/pc41/test/test.txt";
		
		File test = new File(filePath);
		
		//자바에서 파일로 내용쓰기
		// try() 넣으면 구문 종료 후 알아서 종료
//		FileOutputStream(test, true)는 이어쓰기 형태로 추가   
		try(FileOutputStream fos = new FileOutputStream(test, true);) {
			
			byte[] fire = {'F','i','r','e'};
			
			fos.write('H');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			fos.write(fire);
			
			// String에 .getBytes()하면 byte Array로 바꿔줌
			fos.write("Together".getBytes());
			fos.write("안녕 ㅋㅋ".getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일 읽기 
		try(FileInputStream fis = new FileInputStream(test);) {
			System.out.println(fis.available());
			byte[] data = new byte[fis.available()];
			
			while(true) {
				int x = fis.read(data);
				if(x == -1) {
					// 파일을 다 읽었다는 뜻
					break;
				}
				
				// byte 배열을 String으로 바꾸는 법
				String result = new String(data);
				System.out.println(result);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
	}

}

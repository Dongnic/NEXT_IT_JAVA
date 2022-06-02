package projecttest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {

	public static void main(String[] args) {
		String filePath = "/home/pc41/test/test.txt";
		
		File test = new File(filePath);
		
		try(FileOutputStream fos = new FileOutputStream(test);) {
			
			byte[] fire = {'F','i','r','e'};
			
			fos.write('H');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			fos.write(fire);
			
			fos.write("Together".getBytes());
			fos.write("안녕 ㅋㅋ".getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

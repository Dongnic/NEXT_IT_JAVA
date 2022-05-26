package projecttest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;        
		
		try {
			Robot robot = new Robot();
			while (1<2) {
//				str = robot.keyPress(KeyEvent.VK_O);
//				System.out.println(str);        
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}

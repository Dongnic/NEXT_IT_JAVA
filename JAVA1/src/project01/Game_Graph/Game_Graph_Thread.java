package project01.Game_Graph;

import java.util.Timer;
import java.util.TimerTask;

public class Game_Graph_Thread extends Thread {
	static volatile boolean threadStop = true;
	static volatile boolean gameStop = true;
	static double count = 0.00;

	@Override
	public void run() {
		count = 0.00;
		double stop = Math.round((Math.random() * 1000)) / 100.00;
		while (threadStop) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
//				e.printStackTrace();
			}
			String blank = "";
			String star = " _/";
			if (count < stop) { // count값이 stop보다 커지면 종료
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				if ((Math.round(count * 100) / 100) % 1.00 == 0) {
					blank = "";
					for (int l = 0; l < count - 1; l++) {
						blank += "  ";
					}
					for (int k = 0; k < count; k++) {
						System.out.println(blank + star);
						if (blank.length() != 0) {
							blank = blank.substring(0, blank.length() - 2);
						}
					}
				}
				System.out.printf("[%.2f배]", (count + 0.01));
				count += 0.01;
			} else {
				count = 0.00;
				System.out.println("[카운트다운 : 종료]");
				System.out.printf("[%.2f배]ㅋㅋㅋㅋㅋ", count);
				System.out.println("[Enter 입력]");
				gameStop = false;
				threadStop = false;
			}
		} // while문 종료
		System.out.println("끝남");
	}

	public static void graph() {
		count = 0.00;
		threadStop = true;
		gameStop = true;
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
//		@Override
			public void run() {
				double stop = Math.round((Math.random() * 1000)) / 100.00;
//		double stop = 9.99;
				while (threadStop) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					String blank = "";
					String star = " _/";
					if (count < stop) { // count값이 stop보다 커지면 종료
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						if ((Math.round(count * 100) / 100) % 1.00 == 0) {
							blank = "";
							for (int l = 0; l < count - 1; l++) {
								blank += "  ";
							}
							for (int k = 0; k < count; k++) {
								System.out.println(blank + star);
								if (blank.length() != 0) {
									blank = blank.substring(0, blank.length() - 2);
								}
							}
						}
						System.out.printf("[%.2f배]", (count + 0.01));
						count += 0.01;
					} else {
						timer.cancel(); // 타이머 종료
						count = 0.00;
						System.out.println("[카운트다운 : 종료]");
						System.out.printf("[%.2f배]ㅋㅋㅋㅋㅋ", count);
						System.out.println("[Enter 입력]");
						gameStop = false;
						threadStop = false;
					}
					if (gameStop) {
						timer.cancel();
					}
				} // while문 종료
			}
		};
		timer.schedule(task, 10, 10); // 실행
		System.out.println("dddddddddddddddddddddd");
	}// run

	public static boolean getThreadStop() {
		return threadStop;
	}

	public static void setThreadStop(boolean stop) {
		Game_Graph_Thread.threadStop = stop;
	}

	public static double getCount() {
		return count;
	}

	public static boolean getGameStop() {
		return gameStop;
	}

	public static void setGameStop(boolean gameStop) {
		Game_Graph_Thread.gameStop = gameStop;
	}
}

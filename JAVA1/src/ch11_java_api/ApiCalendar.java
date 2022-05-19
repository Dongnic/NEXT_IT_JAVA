package ch11_java_api;

import java.util.Calendar;

public class ApiCalendar {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = 2022;
		int month = 5;
		calendar.set(year, month-1, 1);
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(startDay + " " + lastDay);
		System.out.println(6 % 7);
		System.out.println(year + "년 " + month +"월 달력");
		System.out.println("월\t화\t수\t목\t금");
		int currentDay = 1;
		for(int i=1; i<= 42; i++) {
			if(i<startDay-1) {
				System.out.print("\t");
			}else {
				if((i%7) == 6 || (i%7) == 0) {
				
				}else {
				System.out.printf("%2d\t", currentDay);
				}
				currentDay++;
				if(currentDay > lastDay){
					break;
				}
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	} // main
}

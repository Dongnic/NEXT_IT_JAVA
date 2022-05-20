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
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println("["+year + "년 " + month +"월 달력]");
		System.out.print("["+week[calendar.get(Calendar.DAY_OF_WEEK)-1]+ "요일부터 시작]"+"\n");
		if(startDay == 1) {
			System.out.print(startDay);
		}
		for(int i=0; i<5; i++) {
			int day1 = i*7+(8-startDay);
			int day2 = i*7+(8-startDay+1);
			if(day1 >= lastDay) {
			}else {
					System.out.print(" "+day1);
			}
			if(day2 >= lastDay) {
			}else{	
					System.out.print(" "+day2);
			}
		}
		System.out.print("일 제거");
		System.out.println();
		
		// 달력 시작
		System.out.println("===================================");
		System.out.println("월\t화\t수\t목\t금");
		// 시작 일
		int currentDay = 1;
		for(int i=0; i<42; i++) {
			if(i < startDay-1) {
				if(i==0){
				}else {
					System.out.print("\t");
				}
			}else{
				if(i%7==0 || i%7==6){
				}else{
					System.out.printf("%2d\t", currentDay);
				}
				currentDay++;
			}
			if(i!=0 && i%7==0){
				System.out.print("\n");
			}
			if(currentDay > lastDay){
				break;
			}
		}
	} // main
}

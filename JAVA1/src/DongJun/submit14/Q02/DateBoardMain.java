package DongJun.submit14.Q02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		 // dbList에 랜덤 날짜를 가지는 DateBoard 객체 30개 삽입
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for(int i = 0; i < 30; i++) {
			int randMonth = (int)(Math.random() * 5) + 1;		// 1~5
			int randDay = (int)(Math.random() * 28) + 1;		// 1~28	
			Calendar cal = Calendar.getInstance();
			cal.set(2022, randMonth-1, randDay);
					
			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard(i + "번째 생성된 글", strDate));
		}
				
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		// 3
		System.out.println("날짜별로 정렬 후 출력(최신 순)");
		for(int i = 0; i < dbList.size(); i++) {
			for(int j = 0; j < dbList.size()-1-i; j++) {
				Date date1 = sdf.parse(dbList.get(j).getDate());
				Date date2 = sdf.parse(dbList.get(j+1).getDate());
				if(date1.getTime() > date2.getTime()) {
					DateBoard temp2 = dbList.get(j);
					dbList.set(j, dbList.get(j+1));
					dbList.set(j+1, temp2);
				}
			}
		}
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		
		System.out.println();
		
		// 4
		System.out.println("날짜별로 정렬 후 출력(오래된 순)");
		for(int i = 0; i < dbList.size(); i++) {
			for(int j = 0; j < dbList.size()-1-i; j++) {
				Date date1 = sdf.parse(dbList.get(j).getDate());
				Date date2 = sdf.parse(dbList.get(j+1).getDate());
				if(date1.getTime() < date2.getTime()) {
					DateBoard temp2 = dbList.get(j);
					dbList.set(j, dbList.get(j+1));
					dbList.set(j+1, temp2);
				}
			}
		}
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		System.out.println("4번");
		// 4
		for(int j = 0; j < dbList.size(); j++) {
			Date date1 = sdf.parse(dbList.get(j).getDate());
			if(30 >( (date.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24) ))
			System.out.println(dbList.get(j));
		}
		System.out.println("5번");
		// 5
		for(int i = 0; i < dbList.size(); i++) {
			Date date1 = sdf.parse(dbList.get(i).getDate());
			if(date.getMonth() == date1.getMonth()) {
				System.out.println(dbList.get(i));
			}
		}
		System.out.println("6번");
		// 6
		for(int i = 0; i < dbList.size(); i++) {
			Date date1 = sdf.parse(dbList.get(i).getDate());
			if(date1.getMonth() == date.getMonth()-3) {
				System.out.println(dbList.get(i));
			}
		}
		System.out.println("7번");
		// 7
		// 날짜 연산
		String sDay = "2022.02.14 00:00:00";
		String fDay = "2022.03.21 00:00:00";
		Date day1 = sdf.parse(sDay);
		Date day2 = sdf.parse(fDay);
		
		for(int i = 0; i < dbList.size(); i++) {
			Date date1 = sdf.parse(dbList.get(i).getDate());
			if(date1.getTime() > day1.getTime() && date1.getTime() < day2.getTime()) {
				System.out.println(dbList.get(i));
			}
		}
		
	}

}

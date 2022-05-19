package ch11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ApiDate {

	public static void main(String[] args) throws ParseException {
		// 현재 시간
		// 1. Date 클래스 사용
		Date dateToday = new Date();
		// 실행하는 순간 변수에 현재 시간 저장
		System.out.println(dateToday);
		
		// 2022년 05월 18일 14시 05분 05초
		// 2022/05/18 14:05:05 포맷으로 설정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strToday = sdf.format(dateToday);
		System.out.println(strToday);
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		strToday = sdf.format(dateToday);
		System.out.println(strToday);
		
		// 2. Calendar 클래스 이용
		// .getInstance()이지만 싱글톤 패턴이 미적용됨
		// new Date()와 마찬가지로 현재 시간 저장
		Calendar calToday = Calendar.getInstance();
		System.out.println(calToday);
		System.out.println(calToday.getTime());
		strToday = sdf.format(calToday.getTime());
		System.out.println(strToday);

		// 3. System 클래스 사용
		long longToday = System.currentTimeMillis();
		System.out.println(longToday);
		
		// 날짜 포맷 설정 
		strToday = sdf.format(longToday);
		System.out.println(strToday);
		
		System.out.println("=================================================");
		
		// 다양한 날짜 타입 만들기
		// 1. 2022/05/18 14:27:20
		// 2. 2022-05-18 오후 02:27:20
		// 3. 수 오후 02:27:20
		// 4. 수요일 14:27:20
		// 5. 2022.05.18 PM 02:27:20
		
		Date dateNow = new Date();
		// 1
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(dateNow));
		// 2
		sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf.format(dateNow));
		// 3
		sdf = new SimpleDateFormat("E a hh:mm:ss");
		System.out.println(sdf.format(dateNow));
		// 4
		sdf = new SimpleDateFormat("E요일 HH:mm:ss");
		System.out.println(sdf.format(dateNow));
		// 5
		sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss", Locale.US);
		System.out.println(sdf.format(dateNow));
		
		// 날짜(Date 타입) <-> 문자열(String 타입)
		String strday = "2022-05-19 15:03:22";
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateTomorrow = sdf.parse(strday);
		System.out.println(dateTomorrow);
		
		String strTime = "11:20:33";
		sdf = new SimpleDateFormat("HH:mm:ss");
		Date dateTime = sdf.parse(strTime);
		System.out.println(dateTime); // 세팅안하면 날짜 1970/1/1 자동설정
		
		String strYear = "2022-03-20";
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dateYear = sdf.parse(strYear);
		System.out.println(dateYear); // 세팅안하면 시간 00:00:00 자동설정
		
		// 디데이 
		String dday = "2022.06.01";
//		Date ddate = sdf.parse(dday);
 		
		// 날짜 연산 Calendar
		// 한 날짜를 기준으로 더하거나 뺄 때 유용
		Calendar toCal = Calendar.getInstance();
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf.format(toCal.getTime()));
		
		// 3일 뒤
		toCal.add(Calendar.DATE, 3);
		System.out.println(sdf.format(toCal.getTime()));

		// 20일 뒤
		toCal.add(Calendar.DATE, 20);
		System.out.println(sdf.format(toCal.getTime()));
		
		// 11개월 뒤
		toCal.add(Calendar.MONTH, 11);
		System.out.println(sdf.format(toCal.getTime()));
		
		// 달력 만들기
		int year = 2022;
		int month = 10;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		System.out.println(sdf.format(calendar.getTime()));
		
		// 해당 달의 마지막 일자(DATE) 얻기
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		// 해당 달의 시작요일
		// 1.일 7.토
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay);
		
		System.out.println(year + "년 " + month +"월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int currentDay = 1;
		for(int i=1; i<= 42; i++) {
			if(i < startDay) {
				System.out.print("\t");
			}else{
				System.out.printf("%2d\t", currentDay);
				currentDay++;
				
				if(currentDay > lastDay){
					break;
				}
				
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	}

}

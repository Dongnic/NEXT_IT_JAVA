package ch12_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class ExMethod {
	//날짜 문자열을 입력하면 밀리초로 바꿔서 리턴
	
	public static long dateMillSec(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp = sdf.parse(date);
		return temp.getTime();
	}
	
	// 입력받은 이름을 콘솔에 출력하는 메소드
	// 만약 입력받은 이름이 숫자거나 empty면 안됨
	
	public static void printName(String name) throws BizException {
		String regex = "^.*[0-9].*$";
		
		if(name.length() == 0) {
			throw new BizException(ErrConstants.API_0001, "이름에 empty가 들어옴");
		}else if(Pattern.matches(regex, name)) {
			throw new BizException("API_0002", "이름에 숫자가 들어옴");
		}
		
		System.out.println(name);
	}
}

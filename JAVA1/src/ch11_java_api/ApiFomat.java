package ch11_java_api;

import java.text.DecimalFormat;

public class ApiFomat {

	public static void main(String[] args) {
		// 숫자 형식 DecimalFormat
		
		// 자리수에 맞춰 숫자 앞에 0 붙이기
		// 1이면 001, 11이면 011, 111이면 111
		DecimalFormat deci = new DecimalFormat("0000");
		int anyNum = 13;
		System.out.println(deci.format(anyNum)); // 0013
		
		// 소숫점 뒤에 0붙이기
		deci = new DecimalFormat("0.0000");
		double anyDouble = 0.13;
		System.out.println(deci.format(anyDouble)); // 0.1300

		// 소수 넷째자리에서 반올림
		double pi = 3.141592;
		deci = new DecimalFormat("#.###");
		System.out.println(deci.format(pi)); // 3.142
		
		int money = 1003120000;
		deci = new DecimalFormat("#,###");
		System.out.println(deci.format(money));
		
		// StringBuffer
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		
		// 문자열 추가
		sb.append("안녕");
		System.out.println(sb);
		sb.append("하세요");
		System.out.println(sb);
		
	}

}

package ch03_system_inout;

public class Comments {
	// 자바 문서(javadoc) 주석
	/**
	 * 나겸씨가 좋아하는 과일
	 */
	static String strawberry = "딸기";

	
	public static void main(String[] args) {
		// 주석(Comment)
		
		// 단일 주석 (코드 앞에 //)
		// 단축키 [Ctrl + /]
		
		/*
		   다중 주석
		 * 작성자 : 유동준
		 * 작성일 : 2022-04-13
		 */
		
		System.out.println(strawberry);
		
		// TODO 주석
		// 개발 중에 구현해야할 부분에 대해서 미리 작성을 해놓는 경우 이용
		
		// TODO 딸기를 콘솔창에 출력해야함
		
		
	}

}

package ch12_exception;


public class ExceptionMain {

	public static void main(String[] args) throws java.text.ParseException {
		int[] intArray = {1,2,3};
		
		try {
			System.out.println(intArray[3]);
		// 예외 이름 + 파라미터(exception 약어 e)넣기
		}catch(ArrayIndexOutOfBoundsException exception) {
			// 오류 원인 및 위치 출력
			exception.printStackTrace();
			// 에러가 콘솔창에 출력되는 시점과
			// .out.println()이 출력되는 시점이 다름
			System.out.println("오류!!");
			System.err.println("빨간글씨");
		}
		try {
			System.out.println(intArray[3]);
		// 예외 이름 + 파라미터(exception 약어 e)넣기
		// Exception이 예외 중 최상위여서 대부분의 예외를 처리해줌
		}catch(Exception e) {
			// 오류 원인 및 위치 출력
			e.printStackTrace();
			// 에러가 콘솔창에 출력되는 시점과
			// .out.println()이 출력되는 시점이 다름
			System.out.println("오류!!");
			System.err.println("빨간글씨");
		}
		
		// 충분히 예측되는 예외의 경우
		// 따로 Exception 클래스를 만들어서 처리한다.
		// BizException
		try {
			System.out.println(ExMethod.dateMillSec("2022.05.20"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("========================================");
		try {
		ExMethod.printName("");
		}catch(BizException e) {
			e.printStackTrace();
			System.out.println(e.getErrCode());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}// main

}

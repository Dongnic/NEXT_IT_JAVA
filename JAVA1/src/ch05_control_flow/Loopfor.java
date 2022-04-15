package ch05_control_flow;

public class Loopfor {

	public static void main(String[] args) {
		// 반복문
		// for문
		
		// 콘솔창에 1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for(int i = 1; i < 9; i+=2) {
			System.out.println(i);
		
		}
		
		System.out.println("===================================");
		
		// 1부터 20까지 더하기
		int result = 0;
		for(int i = 1; i <= 20; i++) {
			result += i;
		}
		System.out.println(result);
		
		// 21부터 45까지 더하기
		int addresult = 0;
		for(int i = 21; i <= 45; i++) {
			addresult += i;
		}
		System.out.println(addresult);
		
		System.out.println("===================================");
		
		for(double i = 0; i < 2; i += 0.2) {
			System.out.println(i);
			// 실수인 float과 double의 연산은
			// 정확하지 않으므로 비추천
		}
		
		for(int i = 0; i <= 20; i +=2 ) {
			System.out.println(i/10.0);
		} 
		
		System.out.println("===================================");
		
		// 구구단 2단
		// 2 x 1 =  2
		// 2 x 9 = 18
		int gugu = 2 ;
		int resu = 0;
		
		for(; gugu < 10; gugu++) {
			System.out.println("----"+ (gugu) +"단----");
			for(int i = 1; i <= 9; i ++ ) {
				resu = i * gugu;
				System.out.println(gugu + " x " + i + " = " + resu);
				} // for2 끝 	
		} // for1 끝

		/*
		 * 디버깅 모드
		 * 코드라인 좌측 부분을 더블클릭하여 
		 * breakpoint(초록점)를 만든 후 실행
		 * 단축키 : Ctrl + shift + B
		 * 토글형식이라 더블클릭 혹은 단축키로
		 * 생성/삭제 가능
		 *  
		 * 디버깅 목적
		 * 코드를 한줄씩 실행해보며 변수에
		 * 어떤 값이 담기고 있는지 확인할 때 사용
		 * 
		 * 디버깅 실행
		 * 상단 벌레모양 아이콘 클릭 
		 * 디버깅 모드에 적합한 화면(Perspective) 전환 여부
		 * 코드들이 위에서 부터 실행되다가 breakpoint가
		 * 있는 지점에 멈춰서 대기를 한다.
		 * 
		 * 이후 상단의 Run - step over [단축키 F6]을
		 * 실행하면 한줄한줄 실행이 된다.
		 * 
		 * 디버깅 모드를 종료하려면 Terminate
		 * 단축키 [Ctrl + F2]
		 * 
		 * 이후 원래 화면(Perspective)로 돌아오려면
		 * 우측 상단에서 Java Perspective를 클릭
		 * 
		 *  */
		System.out.println("===================================");
		// 1부터 10까지 홀수만 출력
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1)
			System.out.println(i);
		} // 10번 실행
		
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		} // 5번 실행
		System.out.println("===================================");
		
		// *트리를 만들어 보세요
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		for(int i = 1; i <= 5; i++) {
			for(; i < i; i++) {
				System.out.print("*");
			}
		}
		System.out.println("===================================");

		// % 나머지 연산 주로 사용 예시
		// for문 내에서 순환하는 숫자에 대해 사용
		
		// 국수공장에서 면을 20cm 뽑고 있는데,
		// 5cm마다 다 잘라주기
		
		for(int i = 0; i < 20; i++) {
			System.out.println("|||||||");
			
			// i가 4일 때 면이 5cm이므로 잘라야함
			if(i!= 0 && i % 4 == 0) {
				System.out.println("-------");
			}
		}
		
		System.out.println("==========안성탕면============");
		
		// 라면 공장에서 면을 30cm 뽑고 있는데 
		// 6cm마다 잘라주어야 한다.
		for(int i = 1; 0 <= 1; i++) {
			if(i % 2 ==1) {
				System.out.println("////////");
			}else {
				System.out.println("\\\\\\\\\\\\\\\\");
			}
			
			if(i % 6 == 0) {
				System.out.println("---------면 뽑는중..");
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}

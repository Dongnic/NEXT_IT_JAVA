package DongJun.submit01;

public class Q02 {

	public static void main(String[] args) {
		String enigma = "너오구늘리뭐너먹구지리";
		String enigmaChange1 = enigma.replace("너", "");
		System.out.println("1차 암호 해독[너 제거]: " + enigmaChange1);
		String enigmaChange2 = enigmaChange1.replace("구", "");
		System.out.println("2차 암호 해독[구 제거]: " + enigmaChange2);
		String enigmaChange3 = enigmaChange2.replace("리", "");
		System.out.println("3차 암호 해독[리 제거]: " + enigmaChange3);
		System.out.println("해독완료!! ->" + enigmaChange3);
		enigma = enigma.replace("너","").replace("구","").replace("리","");
		System.out.println(enigma);		
	}

}

package DongJun.submit02;

public class MakeHex02 {

	public static void main(String[] args) {
		String myHexStr = makeHex(23);
		System.out.println(myHexStr);
	}
	static String makeHex(int inputnum) {
		
		String text = "";
		outer: while(true) {
			if (inputnum >= 16) {
				text += (inputnum % 16);
				inputnum = inputnum / 16;
			 	if(inputnum == 1) {
			 		text += (inputnum % 16);
			 		break outer;
			 	}
			}
		}
		String result = "";
		for(int i = text.length()-1; i >= 0; i--) {
			result += text.substring(i, i+1);   // substring 이용
		} 
		return result;
	}
}

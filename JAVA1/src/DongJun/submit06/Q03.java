package DongJun.submit06;

public class Q03 {

	public static void main(String[] args) {
		String myBinaryStr = makeBinary(16);
		System.out.println(myBinaryStr); 
	}
	static String makeBinary(int inputnum) {
		String text = "";
		text = 3 + "";
		    while(true) {
				if (inputnum >= 2) {
				text = (inputnum % 2) + text;
				inputnum = inputnum / 2;
				}
			 	if(inputnum == 1) {
				text = (inputnum % 2) + text;
		 		return text;
			 	}		
		}
	}
}

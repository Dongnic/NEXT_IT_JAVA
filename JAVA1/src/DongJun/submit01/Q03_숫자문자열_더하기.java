package DongJun.submit01;

public class Q03_숫자문자열_더하기 {
	public static void main(String[] args) {
		String example ="278";
		int addnum = Integer.parseInt(example.substring(0, 1)) 
					+ Integer.parseInt(example.substring(1, 2)) 
					+ Integer.parseInt(example.substring(2, 3));
		System.out.print("결과는 : ");
		System.out.println(addnum);
//		System.out.println("결과는 : " + addnum);
 }
}

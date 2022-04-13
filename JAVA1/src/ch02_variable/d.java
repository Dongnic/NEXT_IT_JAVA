package ch02_variable;

public class d {

	public static void main(String[] args) {
		String example ="278";
		String num1 = example.substring(0, 1);
		String num2 = example.substring(1, 2);
		String num3 = example.substring(2, 3);
		int addnum1 = Integer.parseInt(num1);
		int addnum2 = Integer.parseInt(num2);
		int addnum3 = Integer.parseInt(num3);
		System.out.println("결과는 : " + (addnum1 + addnum2 + addnum3));
		System.out.println(addnum1 + addnum2 + addnum3);
//		int addnum1_1 = Integer.parseInt(example.charAt(0, 1));
//		String example ="278";
		System.out.println("=================");
		char a = example.charAt(0); // 2
		int a1 = example.charAt(0); // 50
		System.out.println(a);
		System.out.println(a1);
		char b = example.charAt(1);
		int b1 = example.charAt(1);
		System.out.println(b);      // 7
		System.out.println(b1);     // 55
		int c = a+b;
		System.out.println(c);
		System.out.println(a+b);
	
	
	}

}

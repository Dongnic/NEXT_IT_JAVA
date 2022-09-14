package exam;

public class Casting {
	public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
	public static void main(String[] args) {
		// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		int a = 1;
        int b = 2;
 
        System.out.println(a + " " + b);
        swap(a, b);
        System.out.println(a + " " + b);
        
        System.out.println(true + ""); // String으로 형변환(String true)
        System.out.println('J' + 100); // int로 형변환(174)
	}

}

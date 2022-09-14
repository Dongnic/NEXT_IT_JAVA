package exam;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			String word = "";
			if(i % 3 == 0) word += "Fizz";
			if(i % 5 == 0) word += "Buzz";
			System.out.println(i+" "+word);
		}
	}

}

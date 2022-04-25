package DongJun.submit08;

import ch07_array.ArrayStudy;

public class Q01 {

	public static void main(String[] args) {
		int[] lottoArr = makeLotto();
		ArrayStudy.printArray(lottoArr);
	}
	static int[] makeLotto() {
	 int[] lottoArray = new int[6];
	    int idx = 0;
		while(idx < 6) {
			int randInt = (int)(Math.random()*45)+1;
			boolean isDuple = false;
			
			// 중복체크(중복되면 isDuple은 true)
			for(int i = 0; i < lottoArray.length; i++) {
				if(lottoArray[i] == randInt) {
					isDuple = true;
				}
			}
			if(isDuple == false) {
				lottoArray[idx] = randInt;
				idx++;
			}		
		}
		return lottoArray;
	}
}

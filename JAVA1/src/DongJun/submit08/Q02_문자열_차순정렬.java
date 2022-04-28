package DongJun.submit08;

public class Q02_문자열_차순정렬 {

	public static void main(String[] args) {
		 
		int[] intArray = {23, 456, 213, 32, 464, 1, 2, 4}; // length = 8, intArray[7]
		int max = intArray[0];
		int K = 0;
		for(int j = 0; j <= intArray.length-1; j++) {
				for(int k = 0; k < intArray.length-j; k++) {  // 최댓값 
			    	if(intArray[k] > max) {
			    		max = intArray[k];
			    		K = k; // 최댓값의 자리 저장
			    	}
			    } // 최댓값 max  
				int temp = intArray[intArray.length-1-j]; // 마지막자리 값 temp에 저장
				intArray[K] = temp; // 최댓값 자리에 마지막자리 값 저장
				intArray[intArray.length-1-j] = max; // 마지막자리에 최댓값 저장  
				max = 0; // 최댓값 초기화
			printArray(intArray);
		}
	    
	}
	static void printArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			if(i == intArray.length - 1) {
				System.out.println(intArray[i]);
			}else {
				System.out.print(intArray[i] + ", ");				
			}
		}
	}
	static int maxArray(int... Arr) {
		int max = Arr[0];
		  for(int i = 0; i < Arr.length; i++) {
			  if(Arr[i] > max) {
		    		max = Arr[i];
		    	}	
		  }
		  return max;
	}
}

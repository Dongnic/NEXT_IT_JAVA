package exam;

public class BubbleSort {
	
	public static void printArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			if(i == intArray.length - 1) System.out.println(intArray[i]);
			else System.out.print(intArray[i] + ", ");				
		}
	}
	public static boolean swap(int[] arr, int a, int b) {
		int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return false;
	}
	public static void bubleSort(int[] arr) {
		boolean check = true;
	    for(int i=1; i < arr.length; i++) {
	        for(int j=0; j < arr.length-i; j++) {
	            if(arr[j] > arr[j+1]) check = swap(arr, j, j+1);
	        }
	        if(check) break;
	    }
	}
	public static void selectSort(int[] arr) {
		boolean check = true;
		for(int i=0; i < arr.length; i++) {
			int key = i;
			for(int j=1+i; j < arr.length; j++) {
				if(arr[j] <= arr[key]) key = j;
			}
			check = swap(arr, key, i);
			if(check) break;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 4, 6, 9, 7, 3, 3, 8, 0};
		bubleSort(arr);
		//selectSort(arr);
	    printArray(arr);
	}

}

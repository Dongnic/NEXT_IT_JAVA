package DongJun.submit06;

public class Q02_원하는층수트리 {

	public static void main(String[] args) {
		makeTree(6);
	}
	
	static void makeTree(int treeFloor) {
		String starTree = "*";
		String blank = " ";
		int countBlank = treeFloor - 1;
		for(int i = treeFloor ; i > 0; i--) {
			for(int j = 1; j <= (countBlank); j++) {
				System.out.print(blank);
			}
			System.out.println(starTree);
			starTree += "**"; 
			countBlank = countBlank - 1;
		}
	}
}

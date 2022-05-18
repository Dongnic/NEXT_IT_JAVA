package DongJun.submit14.Q01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String date;
		String name;
		String content;
		Board bd = new Board();
		ArrayList<Board> gulList = new ArrayList<>();

		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.print(">>>");
			int cmd = Integer.parseInt(sc.nextLine());
			
			if(cmd == 1) {
				//TODO 글 목록
				printList(gulList);
			}else if(cmd == 2){
				//TODO 글 쓰기
				
				while(true) {
				System.out.print("글 제목을 입력해주세요: ");
				name = sc.nextLine();
				System.out.print("글 내용을 입력해주세요: ");
				content = sc.nextLine();
				date = sdf.format(new Date());
				System.out.println(bd);
				gulList.add(bd);
				break;
				}
			}else if(cmd == 3) {
				System.out.println("종료합니다.");
				break;
			}
		}
	} // main
	public static void printList(ArrayList<Board> gulList) {
		for(int i=0;i<gulList.size();i++) {
			System.out.println(gulList.get(i));
		}
	}
}


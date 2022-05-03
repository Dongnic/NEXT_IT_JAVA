package ch09_class.homepage;

import java.util.ArrayList;

public class BoardDB {

	private ArrayList<Member> boardList = new ArrayList<>();
	
	private BoardDB() {
		
	}
	
private static BoardDB instance = new BoardDB();
	
	// 객체로 만든 instance를 리턴해주는 함수 만들기
	public static BoardDB getInstance() {
		return instance;
	}
	
	
}

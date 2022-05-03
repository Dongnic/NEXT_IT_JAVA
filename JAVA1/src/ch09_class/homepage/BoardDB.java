package ch09_class.homepage;

import java.util.ArrayList;

public class BoardDB {

	private ArrayList<Board> boardList = new ArrayList<>();
	
	private BoardDB() {
		
	}
	
	private static BoardDB instance = new BoardDB();
	
	// 객체로 만든 instance를 리턴해주는 함수 만들기
	public static BoardDB getInstance() {
		return instance;
	}
	
	// 글 작성
	public void write(String title, String content, String author) {
		boardList.add(new Board(boardList.size()+1, title, content, author));
	}
	// 게시글 목록출력
	public void printBoard() {
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}
	// 게시글 조회(클릭한 거)
	public boolean selectBoard(int no) {
		for(int i = 0; i < boardList.size(); i++) {
			if(boardList.get(i).getNo() == no) {
				System.out.println("제목 : " + boardList.get(i).getTitle());
				System.out.println("작성자 : " + boardList.get(i).getAutor());
				System.out.println("글내용 : " + boardList.get(i).getContent());
				return true;
			}
		}return false;
	}
}

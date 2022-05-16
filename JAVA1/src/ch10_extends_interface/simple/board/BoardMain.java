package ch10_extends_interface.simple.board;

public class BoardMain {

	public static void main(String[] args) {
		// 기본 게시판
		Board basic = new Board("구인", "넥스트아이티", "사람 구합니다.", "6월 마감", "몇 명인가요?",1);
		System.out.println(basic);
		
		// 거래 게시판
		TradeBoard trade = new TradeBoard("판매", "김길동", "와인 팝니다", "21년산", "팔렸나요?", 2, 5000, "와인사진.jpg");
		System.out.println(trade);
		
		// 영상 게시판
		VideoBoard video = new VideoBoard("영상", "정찬웅", "매드무비", "22년 매드무비", "오..", 3, "www.youtube.com");
		System.out.println(video);
	}

}

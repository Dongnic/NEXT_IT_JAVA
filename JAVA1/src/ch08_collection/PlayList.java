package ch08_collection;
// 임포트 단축키 Ctrl + Shift + o
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import ch07_array.ArrayStudy;

public class PlayList {

	public static void main(String[] args) {
		ArrayList<String> playList = new ArrayList<String>(Arrays.asList("INVU: 태연", "사랑은 늘 도망가: 임영웅", "취중고백: 멜로망스", "언제나 사랑해: 케이시", "듣고 싶을까: MSG워너비", "ELEVEN: IVE", "Step Back: GOT the beat", "abcdefu: GAYLE", "회전목마: sokodomo", "너, 너: 휘인", "SMILEY: YENA", "호랑수월가: 탑현", "리무진: 비오", "RUN2U: STAYC", "눈이 오잖아: 이무진", "Counting Stars: 비오", "신호등: 이무진", "어제처럼: 폴킴", "잊었니: 임영웅", "잊을 수 있을까: 노을", "HERO: 임영웅", "Can't Control Myself: 태연", "Next Level: aespa", "strawberry moon: 아이유", "겨울잠: 아이유", "끝사랑: 임영웅", "드라마: 아이유", "Bk Love: 임영웅", "만남은 쉽고 이별은 어려워: 베이식", "Weekend: 태연", "Savage: aespa", "Butter: 방탄소년단", "Dynamite: 방탄소년단", "OHAYO MY NIGHT: 디핵", "사랑인가 봐: 멜로망스", "라일락: 아이유", "Celebrity: 아이유", "낙하: 악동뮤지션", "Blueming: 아이유", "롤린: 브레이브걸스", "고백: 멜로망스", "그런 밤: 태연"));
		
		System.out.println(playList.size());
		
		// 플레이리스트 페이징 구현 
		// 게시판 페이징 구현 예제 
		int totalCountMusic = playList.size();     // 총 음악 수 42
		int showCountOnePage = 10;  // 한 페이지당 보여지는 음악 수 
		 
		System.out.print("총 음악 수 : ");
		System.out.println(totalCountMusic); // 42
		System.out.print("한 페이지 당 음악 수 : ");
		System.out.println(showCountOnePage); // 10
		
		// 총 페이지의 수 
		// 나머지 음악의 페이지도 있어야 하기 때문에 "올림" 처리해야함
		// 올림처리하는 함수 Math.ceil()
		int countPage = (int)Math.ceil((double)totalCountMusic / showCountOnePage);
		System.out.print("총 페이지 수 : ");
		System.out.println(countPage); // 5
		// 마지막 페이지에 있는 음악 수
		int countLastPageMusic = totalCountMusic % showCountOnePage;
		System.out.print("마지막 페이지 음악 수 : ");
		System.out.println(countLastPageMusic); // 2
		//전체 음악 출력
		for(int i = 0; i < totalCountMusic; i++) {
			System.out.println(playList.get(i));
		}
		
		// 1페이지
		System.out.println("===== "+"1 Page =====");
		for(int i = showCountOnePage * 0; i < 1 * showCountOnePage; i++) {
			System.out.println(playList.get(i));
		}
		
		// 2페이지
		System.out.println("===== "+"2 Page =====");
		for(int i = showCountOnePage * 1; i < 2 * showCountOnePage; i++) {
			System.out.println(playList.get(i));
		}
		
		// 3페이지
		System.out.println("===== "+"3 Page =====");
		for(int i = showCountOnePage * 2; i < 3 * showCountOnePage; i++) {
			System.out.println(playList.get(i));
		}
		// 4페이지
		System.out.println("===== "+"4 Page =====");
		for(int i = showCountOnePage * 3; i < 4 * showCountOnePage; i++) {
			System.out.println(playList.get(i));
		}
		// 5페이지
		System.out.println("===== "+"5 Page =====");
		for(int i = showCountOnePage * 4; i < 5 * showCountOnePage; i++) {
			if(i == totalCountMusic) {
				break;
			}
			System.out.println(playList.get(i));	
		}		
		System.out.println("============ 한개의 for문 ==================");
		
		for(int i = 0; i < countPage; i++) {
			System.out.println("===== "+ (i+1)+" Page =====");
			for(int j = showCountOnePage * i; j < showCountOnePage * (i+1); j++) {
				if(j == totalCountMusic) {
					break;
				}
				System.out.println(playList.get(j));	
			}		
		}
		System.out.println("============= 메소드 사용 =================");
		showPlayList(playList);
		
		System.out.println("=========== 정렬 ==========");
		Collections.sort(playList); // a부터 하까지 정렬 
		showPlayList(playList);
		
		System.out.println("========= 검색 ==========");
		
		
		System.out.println(playList.get(0).substring(0,playList.get(0).indexOf(": ")));
		System.out.println(playList.get(0).substring(playList.get(0).indexOf(": ")));
		
		// 검색어를 입력받으면
		// playList에서 해당 검색어를 포함하는
		// 데이터를 담는 ArrayList를 리턴하는 메소드 만들기
		System.out.print("검색어를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		ArrayList<String> searchList = searchSong(input, playList);
		showPlayList(searchList);
		sc.close();
		
		System.out.println("===================================");
		
		// 가수 검색
		searchList = searchSong("가수", "태연", playList);
		showPlayList(searchList);
		// 제목 검색 
		searchList = searchSong("노래", "사랑", playList);
		showPlayList(searchList);

		
	}// main
	
		
	static ArrayList<String> searchSong(String part, String string, ArrayList<String> playList) {
		
		ArrayList<String> returnList = new ArrayList<String>();
		for(int i = 0; i < playList.size(); i++) {
			String[] strArr = playList.get(i).split(": ");
			ArrayStudy.printArray(strArr);
			if(part.equals("가수")){
				if(strArr[1].indexOf(string) != -1) {
					returnList.add(playList.get(i));
				}
			}
			if(part.equals("노래")) {
				if(strArr[0].indexOf(string) != -1) {
					returnList.add(playList.get(i));
				}
			}
		}
		return returnList;
	}

	// 검색 메소드
	static ArrayList<String> searchSong(String string, ArrayList<String> playList) {
		ArrayList<String> returnList = new ArrayList<String>();
		int count = 0;
			for(int i = 0; i < playList.size(); i++) {
				if(playList.get(i).contains(string)) {
					returnList.add(playList.get(i));
				}else{
					count++;
				}
			}
			if(count == playList.size()) {
				System.out.println("해당 검색내용이 없습니다");			
		}
		return returnList;
	}

	static void showPlayList(ArrayList<String> playList) {
		int totalCountMusic = playList.size(); // 총 음악 수 42
		int showCountOnePage = 10;  // 한 페이지당 보여지는 음악 수 
		int countPage = (int)Math.ceil((double)totalCountMusic / showCountOnePage);// 총 페이지의 수 
		
		for(int i = 0; i < countPage; i++) {
			System.out.println("===== "+ (i+1)+" Page =====");
			for(int j = showCountOnePage * i; j < showCountOnePage * (i+1); j++) {
				if(j == totalCountMusic) {
					break;
				}
				System.out.println(playList.get(j));	
			}		
		}
		
	}
}

package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class PlayMap {

	public static void main(String[] args) {
		ArrayList<String> playList = new ArrayList<String>(Arrays.asList("INVU: 태연", "사랑은 늘 도망가: 임영웅", "취중고백: 멜로망스", "언제나 사랑해: 케이시", "듣고 싶을까: MSG워너비", "ELEVEN: IVE", "Step Back: GOT the beat", "abcdefu: GAYLE", "회전목마: sokodomo", "너, 너: 휘인", "SMILEY: YENA", "호랑수월가: 탑현", "리무진: 비오", "RUN2U: STAYC", "눈이 오잖아: 이무진", "Counting Stars: 비오", "신호등: 이무진", "어제처럼: 폴킴", "잊었니: 임영웅", "잊을 수 있을까: 노을", "HERO: 임영웅", "Can't Control Myself: 태연", "Next Level: aespa", "strawberry moon: 아이유", "겨울잠: 아이유", "끝사랑: 임영웅", "드라마: 아이유", "Bk Love: 임영웅", "만남은 쉽고 이별은 어려워: 베이식", "Weekend: 태연", "Savage: aespa", "Butter: 방탄소년단", "Dynamite: 방탄소년단", "OHAYO MY NIGHT: 디핵", "사랑인가 봐: 멜로망스", "라일락: 아이유", "Celebrity: 아이유", "낙하: 악동뮤지션", "Blueming: 아이유", "롤린: 브레이브걸스", "고백: 멜로망스", "그런 밤: 태연"));
		HashMap<String, String> playMap = new HashMap<>();
		for(int i = 0; i < playList.size(); i++) {
			String[] mapArr = playList.get(i).split(": ");
			playMap.put(mapArr[0], mapArr[1]);
		}
		System.out.println(playMap);
		
		showPlayMap(playMap);
		System.out.println("================================");
		HashMap<String, String> searchMap = searchSong("노래", "사랑", playMap);
		showPlayMap(searchMap);
		searchMap = searchSong("가수", "임영웅", playMap);
		showPlayMap(searchMap);
		
		
		
		
		
	}// main
	
	
	static HashMap<String, String> searchSong(String part, String inputText, HashMap<String, String> playMap) {
		Set<String> keySet = playMap.keySet();
		HashMap<String, String> returnMap = new HashMap<>();
		for(String x : keySet) {
			if(part.equals("노래")){
					if(x.contains(inputText)) {
						returnMap.put(x, playMap.get(x));
					}
			}else if(part.equals("가수")) {
				String y = playMap.get(x); {
					if(y.contains(inputText)) {
						returnMap.put(x, playMap.get(x));
					}
				}
			}	
		}
		
		return returnMap;
	}
	// playMap 페이징 메소드 
	static void showPlayMap(HashMap<String, String> playMap) {
		Set<String> keySet = playMap.keySet();
		// 10개 출력 할 때마다 =================== 입력 되도록
		int count = 0;
		for(String key : keySet) {
			if(count % 10 == 0) {
				System.out.println("====== "+ (count/10+1) +"번째 Page ======");
			}
			System.out.println(key + " : " + playMap.get(key));
			count++;
		}
	}

}// class

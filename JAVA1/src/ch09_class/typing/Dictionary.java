package ch09_class.typing;

import java.util.ArrayList;
import java.util.Arrays;

// 타자 연습 때 나오는 단어들을 
// 가지고 있는 클래스
public class Dictionary {

	private ArrayList<String> wordList;
	
	// 기본 생성자 소환 
	Dictionary(){
		String[] nameArray = {"한예성", "김달현", "송나겸", "김성윤", "남궁혜연"
	    		, "오혁진", "최윤정", "박승주", "석승원", "김성빈", "신윤빈", "염현섭"
	    		, "박기현", "유동준", "이한정", "임동성", "임성헌", "정기준", "박설리"
	    		, "가나혜", "황의창"};
		
		wordList = new ArrayList<String>(Arrays.asList(nameArray));
		
	}
	
	public void showWord() {
		System.out.println(wordList.get(0));
	}
	
	public boolean typingCheck(String inputText) {
//		if(inputText.equals(wordList.get(0))) {
//			return true;
//		}
//		return false;
		return inputText.equals(wordList.get(0));
	}
	
	public void removeWord() {
		wordList.remove(0);
	}
	
	public int returnSize() {
		return wordList.size();
	}
	
}

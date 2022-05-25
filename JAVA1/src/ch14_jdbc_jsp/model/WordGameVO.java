package ch14_jdbc_jsp.model;

public class WordGameVO {
	private String words;
	
	public WordGameVO() {
		
	}
	
	public WordGameVO(String words) {
		super();
		this.words = words;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}
	
}

package DongJun.submit14.Q01;

public class AudioBoard extends Board{
	private String audio;

	public AudioBoard(int no, String name, String date, String content, String audio) {
		super(no, name, date, content);
		this.audio = audio;
	}

	@Override
	public String toString() {
		return super.toString() + "audio=" + audio;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}
	
}

package ch09_class.test;

public class vo {
	private String userID="dd";
	private int userage=1;
	@Override
	public String toString() {
		return "vo [userID=" + userID + ", userage=" + userage + "]";
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	public vo() {
		
	}
	public vo(String userID, int userage) {
		this.userID = userID;
		this.userage = userage;
	}
}

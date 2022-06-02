package model;

public class MemVO {
private String mem_id;
private String mem_pw;
private String mem_name;

public MemVO(){
	
}

public MemVO(String mem_id, String mem_pw, String mem_name) {
	super();
	this.mem_id = mem_id;
	this.mem_pw = mem_pw;
	this.mem_name = mem_name;
}

@Override
public String toString() {
	return "[id = " + mem_id + ",name = " + mem_name + "]";
}

public String getMem_id() {
	return mem_id;
}

public void setMem_id(String mem_id) {
	this.mem_id = mem_id;
}

public String getMem_pw() {
	return mem_pw;
}

public void setMem_pw(String mem_pw) {
	this.mem_pw = mem_pw;
}

public String getMem_name() {
	return mem_name;
}

public void setMem_name(String mem_name) {
	this.mem_name = mem_name;
}



}

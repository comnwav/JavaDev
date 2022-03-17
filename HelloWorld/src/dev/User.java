package dev;

public class User {
	
	// field
	private String usrId;
	private String usrGrade;
	private String usrPhone;
	private int usrPoint;
	
	public String getUsrInfo() {
		String result = "ID:"+this.usrId
				+" Grade:"+this.usrGrade
				+" Phone:"+this.usrPhone
				+" Point:"+this.usrPoint;
		return result;
	}
	
	public String getUsrId() {
		return usrId;
	}
	
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	
	public String getUsrGrade() {
		return usrGrade;
	}
	public void setUsrGrade(String usrGrade) {
		this.usrGrade = usrGrade;
	}
	
	public String getUsrPhone() {
		return usrPhone;
	}
	public void setUsrPhone(String usrPhone) {
		this.usrPhone = usrPhone;
	}
	
	public int getUsrPoint() {
		return usrPoint;
	}
	
	public void setUsrPoint(int usrPoint) {
		this.usrPoint = usrPoint;
	}
	

}

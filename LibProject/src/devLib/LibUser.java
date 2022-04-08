package devLib;

import java.util.Date;

public class LibUser {
	
	String usrId; // 유저 ID
	String usrPass; // 유저 Password
	String usrCode; // 유저 고유코드
	long calDay; // 정지날짜수
	Date haltDate; // 대여중지 해제 날짜
	
	public Date getHaltDate() {
		return haltDate;
	}

	public void setHaltDate(Date haltDate) {
		this.haltDate = haltDate;
	}

	public String getUsrId() {
		return usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public String getUsrPass() {
		return usrPass;
	}

	public void setUsrPass(String usrPass) {
		this.usrPass = usrPass;
	}

	public String getUsrCode() {
		return usrCode;
	}

	public void setUsrCode(String usrCode) {
		this.usrCode = usrCode;
	}

	

	public long getCalDay() {
		return calDay;
	}

	public void setCalDay(long calDay) {
		this.calDay = calDay;
	}

	public LibUser() {
		super();
	}

}

package devLib;

public class LibUser {
	
	String usrId; // 유저 ID
	String usrPass; // 유저 Password
	String usrCode; // 유저 고유코드
	int usrHalt; // 정지날짜수
	
	public int getUsrHalt() {
		return usrHalt;
	}
	public void setUsrHalt(int usrHalt) {
		this.usrHalt = usrHalt;
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
	
	public LibUser() {
		super();
	}
	
	@Override
	public String toString() {
		return "LibUser [usrId=" + usrId + ", usrPass=" + usrPass + ", usrCode=" + usrCode + ", usrHalt=" + usrHalt
				+ "]";
	}
	
	

}

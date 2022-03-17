package dev;

public class UserEx {

	public static void main(String[] args) {
		
		User usr1 = new User();
		usr1.setUsrId("helloworld");
		usr1.setUsrGrade("A");
		usr1.setUsrPhone("01099827345");
		usr1.setUsrPoint(1203);
		
		User usr2 = new User();
		usr2.setUsrId("bluesky");
		usr2.setUsrGrade("A");
		usr2.setUsrPhone("01092117345");
		usr2.setUsrPoint(932);
		
		User usr3 = new User();
		usr3.setUsrId("eclipse");
		usr3.setUsrGrade("A");
		usr3.setUsrPhone("01055310126");
		usr3.setUsrPoint(1260);
		
		User[] usr = { usr1, usr2, usr3 };
		
		for (int i=0; i < usr.length; i++) {
			if (usr[i].getUsrGrade() == "A" && usr[i].getUsrPoint() >= 1000) {
				System.out.println(usr[i].getUsrInfo());
			}
		}
	}
}

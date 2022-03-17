package dev;

public class FriendEx {

	public static void main(String[] args) {
		
		// 친구의 정보 이름, 전화번호, 이메일, 키, 몸무게
		
		Friend f1 = new Friend();
		f1.frName = "최규완";
		f1.frPhone = "01030803090";
		f1.frEmail = "geforce3080@gmail.com";
		f1.height = 178.5;
		f1.weight = 80;
		
		Friend f2 = new Friend();
		f2.frName = "권태현";
		f2.frPhone = "01030603070";
		f2.frEmail = "geforce3070@gmail.com";
		f2.height = 182.5;
		f2.weight = 82;
		
		Friend f3 = new Friend();
		f3.frName = "서현일";
		f3.frPhone = "01099827345";
		f3.frEmail = "comnwav@gmail.com";
		f3.height = 179.2;
		f3.weight = 72;
		
		System.out.println(f1);
		
		Friend[] fr = { f1, f2, f3 };
		
		for (int i = 0; i < fr.length; i++) {
			if (fr[i].height <= 180) {
				System.out.println("이름: " + fr[i].frName);
				System.out.println("전화번호: " + fr[i].frPhone);
				System.out.println("email: " + fr[i].frEmail);
				System.out.println("키: " + fr[i].height);
				System.out.println("몸무게: " + fr[i].weight);				
			}
		}
	}
}

package Exercise0511.Exercise015T;

public class MemberService {
	// 타입 메소드명(매개변수1, 매개변수2){실행부}
	boolean login(String id, String password) {
		return id.equals("hong") & password.equals("12345") ? true : false;
	}

	// void 메소드명(매개변수){실행부}
	void logout(String id) {
		System.out.println(id+"님 로그아웃 되었습니다.");
	}
}
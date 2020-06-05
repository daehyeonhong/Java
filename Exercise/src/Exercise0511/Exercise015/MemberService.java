package Exercise0511.Exercise015;

public class MemberService {
	String id;
	String password;

	Member member = new Member(id, password);

	boolean login(String id, String password) {
		if (member.getId().equals(id) && member.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		if (member.getId().equals(id)) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
}

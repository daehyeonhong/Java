package Exercise0511.Exercise015T;

public class MemberService {
	// Ÿ�� �޼ҵ��(�Ű�����1, �Ű�����2){�����}
	boolean login(String id, String password) {
		return id.equals("hong") & password.equals("12345") ? true : false;
	}

	// void �޼ҵ��(�Ű�����){�����}
	void logout(String id) {
		System.out.println(id+"�� �α׾ƿ� �Ǿ����ϴ�.");
	}
}
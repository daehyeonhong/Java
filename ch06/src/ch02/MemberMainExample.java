package ch02;

public class MemberMainExample {
	public static void main(String[] args) {
		Member member = new Member();
		member.name = "ȫ�浿";// �Ӽ� public ���� ������
		member.id = "hong";// �Ӽ� public ���� ������
		//member.pwd = "1234";// �Ӽ� private ���� ������
		
		// ���-�޼ҵ�
		member.geInfo("ADMIN");// �޼ҵ� public ���� ������(������)
		//member.getPwd();// �޼ҵ� private ���� ������(������)
	}
}
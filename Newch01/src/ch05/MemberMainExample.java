package ch05;

public class MemberMainExample {
	public static void main(String[] args) {
		Member m1 = new Member("hong", "ȫ�浿", "abc1", "010-111-1234");
		m1.setPwd("hong", "abc1");

		System.out.println("����� ���:" + m1.getPwd());
		
		System.out.println(m1.getInfo(false));
	}
}
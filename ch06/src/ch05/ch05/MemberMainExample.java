package ch05.ch05;

public class MemberMainExample {
	public static void main(String[] args) {
		Member m1 = new Member("hong", "ȫ�浿", "1234");
		Member m2 = new Member("kim", "��浿", "1111", "�����");
		Member m3 = new Member("wang", "�ձ浿", "3333", "�����", "010-3012-4029");
		Member m4 = new Member("in", "�Ӳ���", "2222", "������", "010-1424-5213", "im@daum.net");

		Member[] members = { m1, m2, m3, m4 };
		for (int i = 0; i < members.length; i++) {
			Member m = members[i];
			System.out.println(m.toString());
			members[i].toString();
		}
	}
}
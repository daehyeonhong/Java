package ch05.ch05;

public class MemberMainExample {
	public static void main(String[] args) {
		Member m1 = new Member("hong", "홍길동", "1234");
		Member m2 = new Member("kim", "김길동", "1111", "서울시");
		Member m3 = new Member("wang", "왕길동", "3333", "서울시", "010-3012-4029");
		Member m4 = new Member("in", "임꺽정", "2222", "수원시", "010-1424-5213", "im@daum.net");

		Member[] members = { m1, m2, m3, m4 };
		for (int i = 0; i < members.length; i++) {
			Member m = members[i];
			System.out.println(m.toString());
			members[i].toString();
		}
	}
}
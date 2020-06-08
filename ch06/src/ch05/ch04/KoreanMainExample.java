package ch05.ch04;

public class KoreanMainExample {
	public static void main(String[] args) {
		// Korean k = new Korean();//default 생성자로는 생성 불가
		Korean korean1 = new Korean("홍길동", "104219-1233012");
		Korean korean2 = new Korean("일지매", "102490-0124921");
		korean1.getInfo();
		korean2.getInfo();
	}
}
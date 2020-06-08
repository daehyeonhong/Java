package ch02;

public class MemberMainExample {
	public static void main(String[] args) {
		Member member = new Member();
		member.name = "홍길동";// 속성 public 접근 지정자
		member.id = "hong";// 속성 public 접근 지정자
		//member.pwd = "1234";// 속성 private 접근 지정자
		
		// 기능-메소드
		member.geInfo("ADMIN");// 메소드 public 접근 지정자(제한자)
		//member.getPwd();// 메소드 private 접근 지정자(제한자)
	}
}
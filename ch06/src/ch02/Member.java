package ch02;

public class Member {
	// 외부 노출 가능 속성 -public 접근 제한자
	public String name;
	public String id;

	// 외부 노출 불가 속성 -private 접근 제한자
	private String pwd = "1234";

	// this -클래스에 의해 생성된 instance를 가리키는 예약어
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// 외부에 노출 가능 메소드 -public 접근 제한자
	public void geInfo(String grant) {
		if (Grant.valueOf(grant) == Grant.ADMIN) {
			System.out.println("비밀 번호는: " + getPwd());
		} else {
			System.out.println(Grant.ADMIN.name() + "이 아니면 확인 불가");
		}
	}

	// 외부에 노출 불가 메소드 -private 접근 제한자
	private String getPwd() {
		return this.pwd;
	}
}
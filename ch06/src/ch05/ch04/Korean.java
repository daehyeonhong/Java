package ch05.ch04;

public class Korean {
	// 필드
	private String name;// null
	private String sNo;// null

	// 생성자
	public Korean(String name, String sNo) {// 로컬(매개) 변수
		this.name = name;
		this.sNo = sNo;
	}

	// 메소드
	public void getInfo() {
		System.out.println(this.name + ", " + this.sNo);
	}
}
package ch02;

public class CellPhone {

	public CellPhone() {
		System.out.println("CellPhone생성자");
	}
}

class DMBCellPhone extends CellPhone {
	public DMBCellPhone() {
		super();// 부모 클래스의 다른 생성자 호출 메소드 super()
		System.out.println("DMBCellPhone생성자");
	}

	public DMBCellPhone(String s) {
		this();// 자신의 클래스 내의 다른 생성자 호출 메소드 this()
		System.out.println("DMBCellPhone생성자");
	}
}
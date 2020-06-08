package ch01.ch01;

public class Point {
	// private로 접근 제한한 멤버는 상속 불가
	private int x, y;

	// public으로 접근 제한한 멤버는 상속 가능
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

// 단일 상속
class ColorPint extends Point {
	private String color;

	// 자식 클래스에서 추가된 멤버
	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() {
		System.out.print(color);
		showPoint();// 부모 클래스의 public접근 제한자 선언된 method 호출
	}
}
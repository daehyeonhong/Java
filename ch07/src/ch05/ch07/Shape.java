package ch05.ch07;

public class Shape {
	protected String name;// "Shape"

	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println(name);// "Shape"
	}
}

class Circle extends Shape {
	protected String name;// 추가된 필드 = "Circle"

	public void draw() {
		name = "circle";
		super.name = "Shape";// 부모 클래스의 필드에 값 저장:정적 바인딩
		super.draw();// 부모 클래스의 메소드 호출:정적 바인딩
		System.out.println(name);// "Circle"
	}
}
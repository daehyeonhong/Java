package ch05.ch05;

public class MethodOverridingEx {
	static void paint(Shape p) {// 메소드의 매개 변수에서 객체의 다형성
		p.draw();
	}

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		paint(new Shape());
		paint(new Line());// Shape p = new Line(); promotion
		paint(new Rectangle());// Shape p = new Rectangle(); promotion
		paint(new Circle());// Shape p = new Circle(); promotion
		Shape s2 = new Shape();
	}
}
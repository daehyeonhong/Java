package ch05.ch06;

public class UsingOverride {
	public static void main(String[] args) {
		// 객체의 다형성
		Shape start, last, obj;
		// 링크드리스트로 도형 생성하여 연결
		start = new Line();
		last = start;
		obj = new Rectangle();
		last.next = obj;// Rectangle 객체 연결
		last = obj;
		obj = new Line();// Line 객체 연결
		last.next = obj;
		last = obj;
		obj = new Circle();// Circle 객체 연결
		last.next = obj;
		// 모든 도형 출력
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;
		}

		Shape[] s = { new Line(), new Rectangle(), new Line(), new Circle() };
		for (int i = 0; i < s.length; i++) {
			s[i].draw();
		}
	}
}

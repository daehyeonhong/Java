package ch13;

public class SquareMainExample {
	public static void main(String[] args) {
		// 상속 받은 자식 클래스 생성시
		// 부모 클래스 영역도 생성 됨
		// 생성 순서는 부모 클래스 영역 먼저 생성된 후, 자식 클래스 영역이 생성
		Square square = new Square();
	}
}
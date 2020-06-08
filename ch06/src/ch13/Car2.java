package ch13;

public class Car2 extends Vehicle {
	// 생성자-기본 생성자(default 생성자)
	Car2() {
		System.out.println("Car2 생성자");
	}

	// speed 변수 재정의
	// private 제한자로 인해서 상속이 아니라 추가
	int speed = 0;

	// 메소드 재정의
	void stop() {
		System.out.println("자동차가 정지합니다.");
	}

	// 메소드 추가
	void fullspeedUp() {
		speed = 5;
	}
}
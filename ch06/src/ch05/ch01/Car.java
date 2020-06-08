package ch05.ch01;

public class Car {
	// 필드
	// 고유속성
	String company = "현대";// 제조사
	String model = "SONATA";// 모델
	String color = "Red";// 색상
	int maxSpeed = 220;// 최고 속도
	int year = 2020;// 제조연도

	// 현재 상태
	int speed;// 현재 속도 0으로 초기화 됨.
	int rpm;// 현재 rpm 0으로 초기화 됨.
	boolean isStop;//현재 정지상태 여부 false로 초기화 됨.

	// 부품
	Body body = new Body();
	Engine engine = null;
	Tire tire;//null로 초기화 됨.

	// 생성자
	// 메소드
	void run() {
		int count = 0;
		count++;
		speed++;
	}
}

class Body {

}

class Engine {

}

class Tire {

}
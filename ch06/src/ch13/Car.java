package ch13;

public class Car {
	// 속성
	int speed;

	// 기능
	void run() {
		System.out.println("달린다.");
	}

	void stop() {
		System.out.println("정지한다.");
	}

	void speedUp() {
		/*
		 * if (++speed > 5) { speed = 5; }
		 */
		speed++;
	}

	void speedDown() {
		if (--speed < 0) {
			speed = 0;
		}
	}

	void getSpeed() {
		System.out.println(speed);
	}
}
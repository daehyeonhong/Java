package ch05;

public class Car {
	Tire tire = new Tire();

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.tire.run();
	}
}

class Tire {
	void run() {
		System.out.println("규격 타이어 달린다.");
	}
}

class HankookTire extends Tire {
	void run() {
		System.out.println("한국 타이어가 달린다.");
	}
}

class KumhoTire extends Tire {
	void run() {
		System.out.println("금호 타이어가 달린다.");
	}
}

class NexenTire extends Tire {
	void run() {
		System.out.println("넥센 타이어가 달린다.");
	}
}
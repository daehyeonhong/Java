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
		System.out.println("�԰� Ÿ�̾� �޸���.");
	}
}

class HankookTire extends Tire {
	void run() {
		System.out.println("�ѱ� Ÿ�̾ �޸���.");
	}
}

class KumhoTire extends Tire {
	void run() {
		System.out.println("��ȣ Ÿ�̾ �޸���.");
	}
}

class NexenTire extends Tire {
	void run() {
		System.out.println("�ؼ� Ÿ�̾ �޸���.");
	}
}
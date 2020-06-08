package ch05.ch04;

//약한 결합
//부품 객체를 교체하더라도 부품을 사용하는 클래스(Car클래스)에
//영향을 미치지 않음
//객체간 의존성이 낮음 - 프로그램 유연함.
public class Car {
	Tire tire1 = new HankookTire();
	Tire tire2;
	Tire tire3;
	Tire tire4;

	// 생성자 -constructor 인젝션
	public Car(Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
		this.tire1 = tire1;
		this.tire2 = tire2;
		this.tire3 = tire3;
		this.tire4 = tire4;
	}

	// set 메소드 -set인젝션
	public void setTire1(Tire tire1) {
		this.tire1 = tire1;
	}

	public void setTire2(Tire tire2) {
		this.tire2 = tire2;
	}

	public void setTire3(Tire tire3) {
		this.tire3 = tire3;
	}

	public void setTire4(Tire tire4) {
		this.tire4 = tire4;
	}
}

class Tire {
}

class HankookTire extends Tire {

}

class KumhoTire extends Tire {

}
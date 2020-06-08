package ch01;

//Mechanic을 상속 받은 Car 클래스
public class Car extends Mechanic {
	// 속성
	Engine engine;
	Tire LeftFrontTire;
	Tire LeftRearTire;
	Tire RightFrontTire;
	Tire RightRearTire;
	Handle handle;

	// 생성자-default생성자
	Car() {
		engine = new Engine();
		LeftFrontTire = new Tire();
		LeftRearTire = new Tire();
		RightFrontTire = new Tire();
		RightRearTire = new Tire();
		handle = new Handle();
	}
}
package ch04;

public class Car {
	Handle handle = new Handle();
	Engine engine = new Engine();
	// 클래스의 필드(속성, 변수, 값)의 다형성
	// 필드 참조 변수에 부모 객체가 아닌 상속 받은 자식 객체도 대입 가능한 성질
	Tire LeftFrontTire = new KeumhoTire();
	Tire LeftRearTire = new Tire();
	Tire RightFrontTire = new Tire();
	Tire RightRearTire = new HankookTire();
}
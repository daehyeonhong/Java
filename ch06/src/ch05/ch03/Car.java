package ch05.ch03;

public class Car {
	String model;
	String company;
	int maxSpeed;

	// 매개변수가 있는 생성자가 소스 코드에 있으면 기본 생성자를 class에 추가하지 않음.
	// 기본 생성자도 필요하면, 기본 생성자도 소스 코드에 등록해주어야함.
	// Car(){
	//
	// }
	// 기본 생성자(DefaultConstructor)는 없고
	// 매개변수가 3개인 생성자만 있음
	Car(String model, String company, int maxSpeed) {
		this.model = model;
		this.company = company;
		this.maxSpeed = maxSpeed;
	}
}
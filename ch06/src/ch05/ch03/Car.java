package ch05.ch03;

public class Car {
	String model;
	String company;
	int maxSpeed;

	// �Ű������� �ִ� �����ڰ� �ҽ� �ڵ忡 ������ �⺻ �����ڸ� class�� �߰����� ����.
	// �⺻ �����ڵ� �ʿ��ϸ�, �⺻ �����ڵ� �ҽ� �ڵ忡 ������־����.
	// Car(){
	//
	// }
	// �⺻ ������(DefaultConstructor)�� ����
	// �Ű������� 3���� �����ڸ� ����
	Car(String model, String company, int maxSpeed) {
		this.model = model;
		this.company = company;
		this.maxSpeed = maxSpeed;
	}
}
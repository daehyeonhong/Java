package ch06.ch02;

//추상 클래스
public abstract class Animal {
	int a;
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	// 추상 메소드 - 상속 받은 클래스에서 반드시 재정의 해야하는 메소드
	abstract void fly();// {System.our.println(";;;;;;")}가 없다
	//일반 메소드 - 상속 받은 자식 클래스에서 상속 받은 그대로 사용하는 경우
	void stop() {
		System.out.println("쉬다");
	}
}

class Bird extends Animal {
	@Override
	void fly() {
		System.out.println("날다");
	}
}

class Insect extends Animal {
	@Override
	void fly() {
		System.out.println("폴짝 뛰다");
	}
}

class Fish extends Animal {
	@Override
	void fly() {
		System.out.println("헤엄치다");
	}
}
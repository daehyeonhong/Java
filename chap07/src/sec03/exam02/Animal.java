package sec03.exam02;

public abstract class Animal {
	public String kind;

	public void breathe() {
		System.err.println("숨을 쉽니다.");
	}

	public abstract void sound();

}
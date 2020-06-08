package ch08.ch02;

public interface MyChildInterface extends MyInterface1, MyInterface2 {
	void m1();

	void m2();
}

class Myclass implements MyChildInterface {

	@Override
	public void m2() {
	}

	@Override
	public void m1() {
	}
}
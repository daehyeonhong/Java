package ch10.ch04;

public class Singleton {
	private static Singleton instance = new Singleton();

	// 기본 생성자를 외부에서 접근 못하도록 private로 캡슐화
	// public Singleton() {}
	private Singleton() {
	}
	//y객체 자식을 빌려주기 위해서 public 접근자의 getInstance()메소드를 선언

	public static Singleton getInstance() {
		return instance;
	}
}
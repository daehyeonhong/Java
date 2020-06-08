package Exercise0513.Exercise007T;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;

		snowTire.run();// 자식 클래스의 run() 메소드
		tire.run();// 자식 클래스의 run() 메소드
	}
}
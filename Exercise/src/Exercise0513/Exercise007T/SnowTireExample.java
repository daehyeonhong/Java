package Exercise0513.Exercise007T;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;

		snowTire.run();// �ڽ� Ŭ������ run() �޼ҵ�
		tire.run();// �ڽ� Ŭ������ run() �޼ҵ�
	}
}
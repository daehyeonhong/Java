package ch05.ch08;

public class Weapon {
	protected int fire() {
		return 1;
	}

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ���: " + weapon.fire());
		Weapon weapon2 = new Cannon();
		System.out.println("������ ��� �ɷ���: " + weapon2.fire());
	}
}

class Cannon extends Weapon {
	@Override
	protected int fire() {
		return 10;
	}
}
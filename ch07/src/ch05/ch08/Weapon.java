package ch05.ch08;

public class Weapon {
	protected int fire() {
		return 1;
	}

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은: " + weapon.fire());
		Weapon weapon2 = new Cannon();
		System.out.println("대포의 살상 능력은: " + weapon2.fire());
	}
}

class Cannon extends Weapon {
	@Override
	protected int fire() {
		return 10;
	}
}
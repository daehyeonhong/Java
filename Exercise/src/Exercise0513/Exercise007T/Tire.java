package Exercise0513.Exercise007T;

public class Tire {
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}

class SnowTire extends Tire {
	// 재정의
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}
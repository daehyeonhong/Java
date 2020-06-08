package Test0512T;

public abstract class Vehicle {
	final int MAX_FEE = 50000;
	String kind;
	int feePerTime;
	int inTime;
	int outTime;

	public Vehicle(String kind, int feePerTime, int intTime, int outTime) {
		this.kind = kind;
		this.feePerTime = feePerTime;
		this.inTime = intTime;
		this.outTime = outTime;
	}

	abstract int calcTime();

	final int calcFee() {
		int time = calcTime();
		if (time > 12)
			return MAX_FEE;
		else {
			return time * getFeePerTime();
		}
	}

	int getFeePerTime() {
		return feePerTime;
	}

	void print() {
		System.out.println("================");
		System.out.println("����:" + kind);
		System.out.println("�����ð�:" + calcTime());
		System.out.println("�������:" + calcFee());
	}

}

package TEST05081;

public class Vehicle {
	final int MAX_FEE = 50000;
	String kind;
	int feePerTime;
	int intTime;
	int outTime;

	public Vehicle(String kind, int feePerTime, int intTime, int outTime) {
		this.kind = kind;
		this.feePerTime = feePerTime;
		this.intTime = intTime;
		this.outTime = outTime;
	}

	int calcTime() {
		return 0;
	}

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

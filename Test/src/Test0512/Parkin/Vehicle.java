package Test0512.Parkin;

import java.util.Scanner;

public class Vehicle {
	Scanner scanner = new Scanner(System.in);
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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getIntTime() {
		return intTime;
	}

	public void setIntTime(int intTime) {
		this.intTime = intTime;
	}

	public int getOutTime() {
		return outTime;
	}

	public void setOutTime(int outTime) {
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
		System.out.println("차종:" + kind);
		System.out.println("주차시간:" + calcTime());
		System.out.println("주차요금:" + calcFee());
	}

}
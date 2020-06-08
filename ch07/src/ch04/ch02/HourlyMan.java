package ch04.ch02;

public class HourlyMan extends Employee {
	// 필드
	int workHour, moneyPerHour;

	public HourlyMan(String name, int workHour, int moneyPrHour) {
		super(name);
		this.workHour = workHour;
		this.moneyPerHour = moneyPrHour;
	}

	// 월급 시급 진원에 따른 다른 급여 산출을 위해 메소드 재정의
	@Override
	int computePay() {
		return workHour * moneyPerHour;// 근무시간*시급
	}

}
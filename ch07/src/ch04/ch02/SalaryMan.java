package ch04.ch02;

public class SalaryMan extends Employee {
	// 자식 클래스에서 추가된 필드
	private int annualSal;

	// 사원별 연봉으로 객체 생성
	public SalaryMan(String name, int annualSal) {
		super(name);
		this.annualSal = annualSal;
	}

	@Override
	int computePay() {
		sal = annualSal / 12;
		return sal;
	}
}
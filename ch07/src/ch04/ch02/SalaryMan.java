package ch04.ch02;

public class SalaryMan extends Employee {
	// �ڽ� Ŭ�������� �߰��� �ʵ�
	private int annualSal;

	// ����� �������� ��ü ����
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
package ch04.ch02;

public class HourlyMan extends Employee {
	// �ʵ�
	int workHour, moneyPerHour;

	public HourlyMan(String name, int workHour, int moneyPrHour) {
		super(name);
		this.workHour = workHour;
		this.moneyPerHour = moneyPrHour;
	}

	// ���� �ñ� ������ ���� �ٸ� �޿� ������ ���� �޼ҵ� ������
	@Override
	int computePay() {
		return workHour * moneyPerHour;// �ٹ��ð�*�ñ�
	}

}
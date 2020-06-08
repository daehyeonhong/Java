package ch04.ch02;

public class Employee {
	private String name;
	int sal;
	// �μ�Ƽ���� ���� ���
	private final float INCENTIVE_RATE = 0.1F;

	public Employee(String name) {
		this.name = name;
	}

	// ������ ������ �޼ҵ�
	int computePay() {
		return 0;
	}

	// ������ �Ұ����� �޼ҵ�
	final int computeIncentive() {
		int pay = computePay();
		int bonus = 0;
		if (pay > 10000) {
			bonus = (int) (pay * INCENTIVE_RATE);
		}
		return bonus;
	}

	void print() {
		System.out.println("========================");
		System.out.println("�̸�: " + name);
		System.out.println("�޿�: " + sal);
		System.out.println("���ʽ�: " + computeIncentive());
	}
}
package ch04.ch02;

public class EmployeeMainExample {
	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		employees[0] = new SalaryMan("ȫ�浿", 500000);
		employees[1] = new SalaryMan("������", 20000);
		employees[2] = new SalaryMan("�Ӳ���", 6000000);
		employees[3] = new HourlyMan("�̼���", 6, 9000);
		employees[4] = new HourlyMan("��浿", 3, 8000);

		// �μ�Ƽ�� ���
		for (int i = 0; i < employees.length; i++) {
			// ��� ���� Ŭ������ �޼ҵ带 �������ϸ�
			// �θ� Ÿ�Կ� ������ �ϴ��� ������ �� �ڽ� �޼ҵ��� ������ ����
			// -���� ���ε�
			// ����ÿ� ������ �� �޼ҵ尡 ���� ��
			Employee employee = employees[i];
			employee.computePay();
			employee.print();
		}
	}
}
package ch04.ch02;

public class EmployeeMainExample {
	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		employees[0] = new SalaryMan("홍길동", 500000);
		employees[1] = new SalaryMan("일지매", 20000);
		employees[2] = new SalaryMan("임꺽정", 6000000);
		employees[3] = new HourlyMan("이순신", 6, 9000);
		employees[4] = new HourlyMan("김길동", 3, 8000);

		// 인센티브 계산
		for (int i = 0; i < employees.length; i++) {
			// 상속 받은 클래스의 메소드를 재정의하면
			// 부모 타입에 대입을 하더라도 재정의 된 자식 메소드의 내용이 실행
			// -동적 바인딩
			// 실행시에 재정의 된 메소드가 실행 됨
			Employee employee = employees[i];
			employee.computePay();
			employee.print();
		}
	}
}
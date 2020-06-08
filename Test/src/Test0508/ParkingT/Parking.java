package TEST0508.ParkingT;

import java.util.Scanner;

import TEST0508.Parking.Kind;

public class Parking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// CarŸ�� �迭 ����
		Car[] cars = new Car[3];
		// CarŸ�� �迭�� Car��ü ���� �� ����
		for (int i = 0; i < cars.length; i++) {
			System.out.print("����> ");
			String kind = scanner.next();
			System.out.print("�����ð�(����): ");
			int inTime = scanner.nextInt();
			cars[i] = new Car(kind, inTime);
		}
		for (int i = 0; i < cars.length; i++) {
			// �����ð� ���
			System.out.print("�����ð�(����): ");
			int outTime = scanner.nextInt();
			cars[i].setOutTime(outTime);
		}
		// ������ ������ ���
		for (int i = 0; i < cars.length; i++) {
			Car c = cars[i];
			calc(c);// ������ ��� �޼ҵ� calc() ȣ��
		}
	}

	// sedan:�ð��� 3000��, suv:�ð��� 5000��, Truck:�ð��� 7000��
	// 12�ð��ʰ��� �ϰ� 50000�� ¡��
	// �����ð��� �����ð��� �Է��Ͽ� ���.
	//
	static void calc(Car car) {
		// ���� �ð� - ���� �ð� = ���� �ð�
		int term = car.getOutTime() - car.inTime;
		double fee = 0;
		if (term > 12) {
			fee = 50000; // �����ð��� 12�ð� �ʰ��� �ϰ� ¡��
		} else if (Kind.Sedan == Kind.valueOf(car.kind)) {
			fee = 3000 * term;
		} else if (Kind.Suv == Kind.valueOf(car.kind)) {
			fee = 5000 * term;
		} else if (Kind.Truck == Kind.valueOf(car.kind)) {
			fee = 7000 * term;
		}
		System.out.println("���� �ð�: " + car.inTime + ",���� �ð�: " + car.getOutTime() + ", ������: " + fee);
	}

}
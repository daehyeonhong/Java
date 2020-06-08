package TEST0508.Parking;

import java.util.Scanner;

public class Parking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Car[] cars = new Car[3];
		String kind;
		int inTime;
		for (int i = 0; i < cars.length; i++) {
			System.out.print((i + 1) + "��° ������ ���� ������ �Է��ϼ���[Sedan/Suv/Truck]");
			kind = scanner.next();
			boolean run = true;
			while (run) {
				switch (kind) {
				case "Sedan":
					run = !run;
					break;
				case "Suv":
					run = !run;
					break;
				case "Truck":
					run = !run;
					break;
				default:
					System.out.print("[Sedan/Suv/Truck]�߿� �����Ͽ� �Է��ϼ���.");
					kind = scanner.next();
					break;
				}
			}
			System.out.print((i + 1) + "��° ������ ���� �ð��� �Է��ϼ���> ");
			inTime = scanner.nextInt();
			cars[i] = new Car(kind, inTime);
		}

		for (Car c : cars) {
			System.out.println(c);
		}

		for (int i = 0; i < cars.length; i++) {
			System.out.print((i + 1) + "��° " + cars[i].kind + "�� ���� �ð��� �Է��ϼ���> ");
			System.out.println("���� �ð��� " + cars[i].inTime + "�� ���� �ð����� �մϴ�.");
			cars[i].outTime = scanner.nextInt();
			boolean run = true;
			while (run) {
				if (cars[i].inTime > cars[i].outTime) {
					System.out.println("���� �ð��� ���� �ð����� �ռ� �� �����ϴ�.");
					System.out.println("���� �ð��� " + cars[i].inTime + "�� ���� �ð����� �մϴ�.");
					System.out.print((i + 1) + "��° " + cars[i].kind + "�� ���� �ð��� �Է��ϼ���> ");
					cars[i].outTime = scanner.nextInt();
				} else {
					run = !run;
				}
			}
		}
		for (int i = 0; i < cars.length; i++) {
			calc(cars[i]);
		}
		scanner.close();
	}

	// Sedan:�ð��� 3000��, Suv:�ð��� 5000��, Truck:�ð��� 7000��
	// 12�ð��ʰ��� �ϰ� 50000�� ¡��
	// �����ð��� �����ð��� �Է��Ͽ� ���.
	static void calc(Car car) {
		car.parkingTime = car.outTime - car.inTime;
		int price = 0;
		int sedPrice = 3000;
		int suvPrice = 5000;
		int TrcPrice = 7000;
		if (car.parkingTime > 12) {
			price = 50000;
			System.out.println("���� ����:" + car.kind + "�� ���� �ð��� 12�ð��� �ʰ��Ͽ� ���� ���: " + price + "��");
			return;
		} else if (car.kind.equals(Kind.Sedan)) {
			price = sedPrice * car.parkingTime;
		} else if (car.kind.equals(Kind.Suv)) {
			price = suvPrice * car.parkingTime;
		} else if (car.kind.equals(Kind.Truck)) {
			price = TrcPrice * car.parkingTime;
		}

		System.out.println("���� ����: " + car.kind + "���� �ð�: " + car.parkingTime + " ���� ���: " + price + "��");
	}

}
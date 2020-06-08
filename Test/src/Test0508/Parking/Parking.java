package TEST0508.Parking;

import java.util.Scanner;

public class Parking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Car[] cars = new Car[3];
		String kind;
		int inTime;
		for (int i = 0; i < cars.length; i++) {
			System.out.print((i + 1) + "번째 차량의 차량 종류를 입력하세요[Sedan/Suv/Truck]");
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
					System.out.print("[Sedan/Suv/Truck]중에 선택하여 입력하세요.");
					kind = scanner.next();
					break;
				}
			}
			System.out.print((i + 1) + "번째 차량의 입차 시간을 입력하세요> ");
			inTime = scanner.nextInt();
			cars[i] = new Car(kind, inTime);
		}

		for (Car c : cars) {
			System.out.println(c);
		}

		for (int i = 0; i < cars.length; i++) {
			System.out.print((i + 1) + "번째 " + cars[i].kind + "의 출차 시간을 입력하세요> ");
			System.out.println("출차 시간은 " + cars[i].inTime + "시 이후 시간여야 합니다.");
			cars[i].outTime = scanner.nextInt();
			boolean run = true;
			while (run) {
				if (cars[i].inTime > cars[i].outTime) {
					System.out.println("출차 시간이 입차 시간보다 앞설 수 없습니다.");
					System.out.println("출차 시간은 " + cars[i].inTime + "시 이후 시간여야 합니다.");
					System.out.print((i + 1) + "번째 " + cars[i].kind + "의 출차 시간을 입력하세요> ");
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

	// Sedan:시간당 3000원, Suv:시간당 5000원, Truck:시간당 7000원
	// 12시간초과시 일괄 50000원 징수
	// 입차시간과 출차시간을 입력하여 계산.
	static void calc(Car car) {
		car.parkingTime = car.outTime - car.inTime;
		int price = 0;
		int sedPrice = 3000;
		int suvPrice = 5000;
		int TrcPrice = 7000;
		if (car.parkingTime > 12) {
			price = 50000;
			System.out.println("차량 종류:" + car.kind + "의 주차 시간이 12시간을 초과하여 주차 요금: " + price + "원");
			return;
		} else if (car.kind.equals(Kind.Sedan)) {
			price = sedPrice * car.parkingTime;
		} else if (car.kind.equals(Kind.Suv)) {
			price = suvPrice * car.parkingTime;
		} else if (car.kind.equals(Kind.Truck)) {
			price = TrcPrice * car.parkingTime;
		}

		System.out.println("차량 종류: " + car.kind + "주차 시간: " + car.parkingTime + " 주차 요금: " + price + "원");
	}

}
package Test0512.ParkinE;

import java.util.Scanner;

public class VehicleMainExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String kind = null;
		int intTime = 0, outTime = 0;
		Vehicle[] vehicles = new Vehicle[3];
		for (int i = 0; i < vehicles.length; i++) {
			boolean isRun = true;
			System.out.print("차종을 선택하세요>[Suv/Sedan/Truck]");
			while (isRun) {
				kind = scanner.next();
				switch (kind) {
				case "Suv":
					vehicles[i] = new Suv(kind, intTime, outTime);
					isRun = !isRun;
					break;
				case "Sedan":
					vehicles[i] = new Sedan(kind, intTime, outTime);
					isRun = !isRun;
					break;
				case "Truck":
					vehicles[i] = new Truck(kind, intTime, outTime);
					isRun = !isRun;
					break;
				default:
					System.out.print("차종을 선택하세요>[Suv/Sedan/Truck]");
					break;
				}
			}
			System.out.print("입차 시간을 입력하세요> ");
			intTime = scanner.nextInt();
			System.out.print("출차 시간을 입력하세요> ");
			outTime = scanner.nextInt();
			vehicles[i].intTime = intTime;
			vehicles[i].outTime = outTime;
		}
		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}
		scanner.close();
	}
}

class Suv extends Vehicle {

	public Suv(String kind, int intTime, int outTime) {
		super(kind, intTime, outTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calcTime() {
		// TODO Auto-generated method stub
		return outTime - intTime;
	}

	@Override
	int getFeePerTime() {
		// TODO Auto-generated method stub
		return 5000;
	}

}

class Sedan extends Vehicle {

	public Sedan(String kind, int intTime, int outTime) {
		super(kind, intTime, outTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calcTime() {
		// TODO Auto-generated method stub
		return outTime - intTime;
	}

	int getFeePerTime() {
		// TODO Auto-generated method stub
		return 7000;
	}
}

class Truck extends Vehicle {

	public Truck(String kind, int intTime, int outTime) {
		super(kind, intTime, outTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calcTime() {
		// TODO Auto-generated method stub
		return outTime - intTime;
	}

	int getFeePerTime() {
		// TODO Auto-generated method stub
		return 9000;
	}
}
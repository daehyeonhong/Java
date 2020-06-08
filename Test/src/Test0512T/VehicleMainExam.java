package Test0512T;

public class VehicleMainExam {
	public static void main(String[] args) {
		// "suv"-시간당 5000원
		// "sedan" -시간당 7000원
		// "truck" - 시간당 9000원
		// 12시간 초과시 일괄 50000원
		Vehicle vehicle = new Suv("suv", 5000, 10, 18);
		Vehicle vehicle2 = new Sedan("Sedan", 7000, 8, 16);
		Vehicle vehicle3 = new Truck("truck", 9000, 5, 17);

		Vehicle[] vehicles = { vehicle, vehicle2, vehicle3 };
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].print();
		}

	}

}

class Suv extends Vehicle {

	public Suv(String kind, int feePerTime, int inTime, int outTime) {
		super(kind, feePerTime, inTime, outTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calcTime() {
		// TODO Auto-generated method stub
		return outTime - inTime;
	}
}

class Sedan extends Vehicle {

	public Sedan(String kind, int feePerTime, int inTime, int outTime) {
		super(kind, feePerTime, inTime, outTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calcTime() {
		// TODO Auto-generated method stub
		return outTime - inTime;
	}
}

class Truck extends Vehicle {

	public Truck(String kind, int feePerTime, int inTime, int outTime) {
		super(kind, feePerTime, inTime, outTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calcTime() {
		// TODO Auto-generated method stub
		return outTime - inTime;
	}
}
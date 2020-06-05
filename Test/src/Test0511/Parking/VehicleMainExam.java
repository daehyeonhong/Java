package Test0511.Parking;

public class VehicleMainExam {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Sedan("Sedan", 4, 20);
		vehicles[1] = new Suv("Suv", 2, 5);
		vehicles[2] = new Truck("Truck", 5, 15);
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].print();
		}
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
package TEST05081;

public class VehicleMainExam {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Sedan("Sedan", 7000, 4, 20);
		vehicles[1] = new Suv("Suv", 5000, 2, 5);
		vehicles[2] = new Truck("Truck", 9000, 5, 15);
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].print();
		}
	}
}

class Suv extends Vehicle {

	public Suv(String kind, int feePerTime, int intTime, int outTime) {
		super(kind, feePerTime, intTime, outTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calcTime() {
		// TODO Auto-generated method stub
		return outTime - intTime;
	}

}

class Sedan extends Vehicle {

	public Sedan(String kind, int feePerTime, int intTime, int outTime) {
		super(kind, feePerTime, intTime, outTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calcTime() {
		// TODO Auto-generated method stub
		return outTime - intTime;
	}
}

class Truck extends Vehicle {

	public Truck(String kind, int feePerTime, int intTime, int outTime) {
		super(kind, feePerTime, intTime, outTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calcTime() {
		// TODO Auto-generated method stub
		return outTime - intTime;
	}
}
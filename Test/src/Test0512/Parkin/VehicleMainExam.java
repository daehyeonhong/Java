package Test0512.Parkin;

public class VehicleMainExam {
	public static void main(String[] args) {

		// "suv"-�ð��� 5000��
		// "sedan" -�ð��� 7000��
		// "truck" - �ð��� 9000��
		// 12�ð� �ʰ��� �ϰ� 50000��String kind;
		Vehicle[] vehicle = new Vehicle[3];
		vehicle[0] = new Vehicle("Suv", 5000, 5, 10);
		vehicle[1] = new Vehicle("Sedan", 7000, 1, 80);
		vehicle[2] = new Vehicle("Truck", 9000, 1, 2);
		for (Vehicle vehicle2 : vehicle) {
			vehicle2.print();
		}
	}

}

class Suv extends Vehicle {

	public Suv(String kind, int feePerTime, int intTime, int outTime) {
		super(kind, feePerTime, intTime, outTime);
	}

	@Override
	int calcTime() {
		// TODO Auto-generated method stub
		return outTime - intTime;
	}

	class Sedan extends Vehicle {

		public Sedan(String kind, int feePerTime, int intTime, int outTime) {
			super(kind, feePerTime, intTime, outTime);
			feePerTime = 7000;
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
}
package Test0508.Parking;

public class Car {
	Kind kind;// Sedan, Truck, Suv
	int inTime;
	int outTime;
	int parkingTime;

	// 생성자
	public Car(String kind, int inTime) {
		this.kind = Kind.valueOf(kind);
		this.inTime = inTime;
	}

	public int getOutTime() {
		return outTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public int getParkingTime() {
		return parkingTime;
	}

	public void setParkingTime(int parkingTime) {
		this.parkingTime = parkingTime;
	}

	@Override
	public String toString() {
		return "차량 종류: " + kind + ", 입차 시간: " + inTime + "시]";
	}

}
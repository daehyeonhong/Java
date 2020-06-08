package TEST0508.ParkingT;

public class Car {
	final int FeePerTime = 5000;
	String kind;// sedan, truck, suv
	int inTime;
	int outTime;

	// »ý¼ºÀÚ
	public Car(String kind, int inTime) {
		this.kind = kind;
		this.inTime = inTime;
	}

	public int getOutTime() {
		return outTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
}
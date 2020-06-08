package ch08;

public class Car {
	// 인스턴스(non-static)멤버(인스턴스, 개별, new)
	int year;
	String model;
	int no;

	// static멤버(공유, 유니크, 로드)
	static int seq;

	public Car(int year, String model) {
		no = ++seq;
		this.year = year;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [" + "모델" + model + "차량생산번호:H" + year + no + "]";
	}

}
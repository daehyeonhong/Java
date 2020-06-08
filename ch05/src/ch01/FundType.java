package ch01;

public class FundType {
	public static void main(String[] args) {
		int num;//로컬 변수
		num = 10;
		System.out.println(num);
		num = 0;
		System.out.println(num);

		FishBread f1 = null;
		f1 = new FishBread();
		System.out.println(f1.name);

		f1 = null;
		System.out.println(f1.name);
	}
}
package ch14.ch03;

public class ComputerMainExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		int[] values1 = { 1, 2, 3 };
		int result = myCom.sum1(values1);
		System.out.println(result);

		int result2 = myCom.sum1(new int[] { 1, 2, 3 });
		System.out.println(result2);

		int result3 = myCom.sum2(1, 2, 3);
		System.out.println(result3);

		int result4 = myCom.sum2(1, 2, 3, 4);
		System.out.println(result4);

		double result5 = myCom.calc(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(result5);
	}
}
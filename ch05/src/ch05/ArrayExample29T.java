package ch05;

/*double타입 값을 5개 저장하는 배열을 만들고
10.5, 20.3, 30.6, 40.5, 45.9를 저장
값들의 합과 평균을 출력하시오.*/
public class ArrayExample29T {
	public static void main(String[] args) {
		double[] doubleArr = new double[5];
		doubleArr[0] = 10.5;
		doubleArr[1] = 20.3;
		doubleArr[2] = 30.6;
		doubleArr[3] = 40.5;
		doubleArr[4] = 45.9;

		double sum = 0;
		sum = sum + doubleArr[0];
		sum = sum + doubleArr[1];
		sum = sum + doubleArr[2];
		sum = sum + doubleArr[3];
		sum = sum + doubleArr[4];

		System.out.println("합: " + sum);
		System.out.println("평균: " + sum / doubleArr.length);

		double[] doubleArr1 = { 10.5, 20.3, 30.6, 40.5, 45.9 };

		double sum1 = 0;

		for (int i = 0; i < doubleArr1.length; i++) {
			sum1 = sum1 + doubleArr1[i];
		}
		System.out.println("합: " + sum1);
		System.out.println("평균: " + sum1 / doubleArr.length);
	}
}
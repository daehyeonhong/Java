package ch05;

/*double타입 값을 5개 저장하는 배열을 만들고
10.5, 20.3, 30.6, 40.5, 45.9를 저장
값들의 합과 평균을 출력하시오.*/
public class ArrayExample29 {
	public static void main(String[] args) {
		double sum;

		double[] doubleArray = { 10.5, 20.3, 30.6, 40.5, 45.9 };

		sum = 0;
		for (int i = 0; i < doubleArray.length; i++) {
			sum += doubleArray[i];
		}

		System.out.println("합: " + sum);
		System.out.println("평균: " + sum / doubleArray.length);
	}
}
package ch02;

public class ArrayExample2 {
	public static void main(String[] args) {
		int sum = 0;
		int scores[] = new int[6];
		// 배열의 각 요소에 값 입력
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 20;
		scores[4] = 20;
		scores[5] = 20;

		sum += scores[0];
		sum += scores[1];
		sum += scores[2];
		sum += scores[3];
		sum += scores[4];
		sum += scores[5];
		
		double avg = sum / 6;
		System.out.println("평균: " + avg);
	}
}
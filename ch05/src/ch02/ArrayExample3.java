package ch02;

public class ArrayExample3 {
	public static void main(String[] args) {
		int sum = 0;
		int scores[] = new int[6];
		// 배열의 각 요소에 값 입력
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		//scores[3] = 20;
		scores[4] = 20;
		scores[5] = 20;
		// scores[6] = 20;<-생성된 배열의 index범위 (0~5)를 벗어나면 오류
		// scores[-1] = 100;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i+"번쨰:"+scores[i]);
		}
		// 배열 저장 공간을 index로 관리, index는 0부터 시작, 생성된 배열의 길이 -1까지
		// 배열의 길이(저장 공간의 갯수) : length
		for (int i = 0; i < scores.length; i++)
			sum += scores[i];

		double avg = sum / scores.length;
		System.out.println("평균: " + avg);
	}
}
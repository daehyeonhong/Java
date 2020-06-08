package ch02;
//for(초기값;비교조건;증감){실행문;}
public class ForExample1 {
	public static void main(String[] args) {
		//1~100까지의 정수를 합한 결과를 출력
		int sum=0;//합한 결과를 저장할 변수 선언, 초기화

		for (int i = 1; i <= 100; i++) {
			sum = sum+i;
		}
		System.out.println("1부터 100까지 정수의 합:\n"+sum);
	}
}
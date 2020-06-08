package ch01;

public class IfExample1 {
	public static void main(String[] args) {
		int num = 3;
		
		//블럭으로 묶여서 하나의 블럭으로 실행
		if (num%2==0) {
			System.out.println(num+"은 짝수입니다.");
			System.out.println(num);
		}
		
		//다른 명령문으로 인식
		if (num%2==0)
			System.out.println(num+"은 짝수입니다.");
		System.out.println(num);
		
		//
		if (num%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		if (num%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println(num);
			System.out.println("홀수");
		}
	}
}

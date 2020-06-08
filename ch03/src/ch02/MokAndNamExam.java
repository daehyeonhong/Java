package ch02;

public class MokAndNamExam {
	public static void main(String[] args) {
		int num = 69;
		int mok, nam;
		
		//몫
		mok = num/10;

		//나머지
		nam = num%10;
		
		System.out.println(num+"을 10으로 나눈 몫:"+mok);
		System.out.println(num+"을 10으로 나눈 나머지"+nam);
		
		System.out.println("실수연산:"+(num/10.0));
	}
}

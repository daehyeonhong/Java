package ch03;
//비교연산자: 두 피연산자 비교 결과는 true/false
public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1==num2);//같은지
		System.out.println(num1!=num2);//다른지
		System.out.println(num1<=num2);//num1이 num2보다 작거나 같은지(이하인지)
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result = char1 < char2;// A(65) < B(66) int값(정수)으로 변환되어 연산에 참여
		System.out.println("result="+result);
		
		int age = 25;
		System.out.println(20<=age&age<30);
	}
}

package ch02;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;//char 타입 리터럴 'A' + 1 => 'B'
		char c2 = 'A';
		char c3 = (char) (c2 + 1);//char 타입 변수 값과 int 타입 리터럴 +연산 => int 타입 값
		
		System.out.println("c1"+c1);
		System.out.println("c2"+c2);
		System.out.println("c2"+c3);
	}
}

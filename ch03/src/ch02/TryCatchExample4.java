package ch02;

public class TryCatchExample4 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;		
		try {
			int result = num1 / num2;
			System.out.println("result:"+result);		
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}

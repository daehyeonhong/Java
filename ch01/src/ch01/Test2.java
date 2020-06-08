package ch01;

public class Test2 {

	public static void main(String[] args) {
		boolean isRun = false;
		
		if(isRun==true) {//false==true?
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		if(isRun) {//isRun변수의 값이 참인가?
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
	}
}

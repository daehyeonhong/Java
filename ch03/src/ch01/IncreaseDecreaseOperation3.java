package ch01;

public class IncreaseDecreaseOperation3 {
	public static void main(String[] args) {
		int a1 = 10, b1 = 7, c1;
		c1 = 2* ++a1 +2 * b1--;
		System.out.println("a1=" + a1);//11
		System.out.println("b1=" + b1);//6
		System.out.println("c1=" + c1);//2 * 11 + 2 * 7 = 36
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

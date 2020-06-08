package ch01;

public class IncreaseDecreaseOperation2 {
	public static void main(String[] args) {
		int family = 10;
		int part = 9;
		
		System.out.println("우리집 인원 수는 " + ((++family) + (--part)) + "입니다.");
		
		int a1 = 7, b1 = 7, a2, b2;
		a2 = ++a1;
		b2 = b1++;
		
		System.out.println("a1=" + a1);
		System.out.println("a2=" + a2);
		
		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		
		int c2 = --a1;
		int d2 = b1--;
		
		System.out.println("a1=" + a1);
		System.out.println("c2=" + c2);
		
		System.out.println("b1=" + b1);
		System.out.println("d2=" + d2);
	}
}

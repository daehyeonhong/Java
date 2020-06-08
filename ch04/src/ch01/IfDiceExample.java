package ch01;

public class IfDiceExample {
	public static void main(String[] args) {
		//1~6까지의 정수를 무작위로 생성하는 식
		int num = (int)(Math.random()*6)+1;
		System.out.println(num);
		/*System.out.println(Math.random());*/
		
		if (num==1) {
			System.out.println("1번");
		} else if (num==2) {
			System.out.println("2번");
		} else if (num==3) {
			System.out.println("3번");
		} else if (num==4) {
			System.out.println("4번");
		} else if (num==5) {
			System.out.println("5번");
		} else {
			System.out.println("6번");
		}
		
		int num1 = (int)(Math.random()*6)+3;
		System.out.println(num1);
	}
}
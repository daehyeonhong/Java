package ch01;

public class IfDiceExample {
	public static void main(String[] args) {
		//1~6������ ������ �������� �����ϴ� ��
		int num = (int)(Math.random()*6)+1;
		System.out.println(num);
		/*System.out.println(Math.random());*/
		
		if (num==1) {
			System.out.println("1��");
		} else if (num==2) {
			System.out.println("2��");
		} else if (num==3) {
			System.out.println("3��");
		} else if (num==4) {
			System.out.println("4��");
		} else if (num==5) {
			System.out.println("5��");
		} else {
			System.out.println("6��");
		}
		
		int num1 = (int)(Math.random()*6)+3;
		System.out.println(num1);
	}
}
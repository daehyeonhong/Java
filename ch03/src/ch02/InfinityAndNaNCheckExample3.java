/*package ch02;

import java.util.Scanner;

public class InfinityAndNaNCheckExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int x;
		double y;
		char o;
		x = scanner.nextInt();
		
		System.out.println("�����ڸ� �������ּ���");
		System.out.println("����:+","����:-","������:/","����*");

		System.out.println("�Ǽ��� �Է��ϼ���:");
		y = scanner.nextDouble();

		double z=x%y;
		double result = (int) (x/y);

		if (Double.isNaN(z)) {
			System.out.println("��� �Ұ�");
		} else {
			System.out.println("��:"+result);
			System.out.println("***��� ����***");
			System.out.println(x+"��"+y+"�� ��������?");
			System.out.println(x+"(��)��"+y+"*"+result+"+"+z);
			System.out.println(x+"��"+y+"�� ����:"+result+"��������:"+z+"(��)��");
		}
	}
}*/
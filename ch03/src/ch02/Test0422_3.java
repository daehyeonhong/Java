package ch02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test0422_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x, y;
		double r1, r2, r3, r4;
		y = 0;
		
		try {

			System.out.println("���ڸ� �Է��ϼ���.");
			x = scanner.nextDouble();
			
			System.out.println("���� ���ڸ� �Է��ϼ���.");
			System.out.println("�� 0�� ����.");
			y = scanner.nextDouble();
			
			r1 = (int)(x+y);
			r2 = (int)(x-y);
			r3 = (int)(x*y);
			r4 = (int)(x/y);
			
			if (y==0) {
				System.out.println(x+"+"+y+"="+r1);
				System.out.println(x+"-"+y+"="+r2);
				System.out.println(x+"*"+y+"="+r3);
				e();
			} else {
				System.out.println(x+"+"+y+"="+r1);
				System.out.println(x+"-"+y+"="+r2);
				System.out.println(x+"*"+y+"="+r3);
				System.out.println(x+"/"+y+"="+r4);
			}
			
		}catch(InputMismatchException e) {
			System.out.println("���ڰ� �ƴմϴ�.");
		} catch (Exception e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}
		scanner.close();
	}
	public static void e() throws Exception{
		throw new Exception("");
	}
}
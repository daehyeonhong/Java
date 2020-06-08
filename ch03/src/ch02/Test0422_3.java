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

			System.out.println("숫자를 입력하세요.");
			x = scanner.nextDouble();
			
			System.out.println("다음 숫자를 입력하세요.");
			System.out.println("단 0은 제외.");
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
			System.out.println("숫자가 아닙니다.");
		} catch (Exception e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		scanner.close();
	}
	public static void e() throws Exception{
		throw new Exception("");
	}
}
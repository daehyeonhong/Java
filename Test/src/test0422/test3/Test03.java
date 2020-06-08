package test0422.test3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x, y , r1, r2, r3, r4, r5;
		
		try {
			System.out.println("정수를 입력하세요.");
			x = scanner.nextInt();
			
			System.out.println("다음 정수를 입력하세요.");
			System.out.println("단 0은 제외.");
			y = scanner.nextInt();
			
			if (y==0) {
				e1();
			} else {
				r1 = x+y;
				r2 = x-y;
				r3 = x*y;
				r4 = x/y;
				r5 = x%y;
				System.out.println(x+"+"+y+"="+r1);
				System.out.println(x+"-"+y+"="+r2);
				System.out.println(x+"*"+y+"="+r3);
				System.out.println(x+"/"+y+"="+r4+"..."+r5);
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자가 아닙니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}
	public static void e1() throws Exception{
		throw new Exception("0으로 나눌 수 없습니다.");
	}
}

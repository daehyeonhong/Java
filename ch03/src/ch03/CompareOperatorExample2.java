package ch03;

import java.util.Scanner;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		char c;
		boolean isRun = true;
		Scanner scanner = new Scanner(System.in);
		
		while(isRun) {
			System.out.println("���ڸ� �ϳ� �Է��ϼ���.");
				
			c = scanner.next().charAt(0);
			
			if (c>='A' && c<='Z') {// '8' > 65 & '8' <= 90, ==>> 56=>65 * 56
				System.out.println("���� c�� �Էµ� ���� �빮���Դϴ�.");
			} else if (c>='a' && c<='z') {// '8' >= 97 & '8' <= 122 ==>> 56>=97 & 56<=122
				System.out.println("���� c�� �Էµ� ���� �ҹ����Դϴ�.");
			} else {
				System.out.println("���� c�� �Էµ� ���� ���ڰ� �ƴմϴ�.");
			}
			
			System.out.println(c>='A' && c<='Z'? "���� c�� �Էµ� ���� �빮���Դϴ�.":
							   c>='a' && c<='z'? "���� c�� �Էµ� ���� �ҹ����Դϴ�.":
												 "���� c�� �Էµ� ���� ���ڰ� �ƴմϴ�.");
			
			System.out.println("����ұ��?");
			char yesNo = scanner.next().charAt(0);
			if (yesNo=='n'||yesNo=='N') {
				isRun=!isRun;
			}
		}
		System.out.println("���α׷� ����.");
		scanner.close();
	}
}

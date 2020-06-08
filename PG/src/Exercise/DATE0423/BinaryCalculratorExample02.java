package Exercise.DATE0423;

import java.util.Scanner;

public class BinaryCalculratorExample02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, plus, minus, multi, division, remain;
		boolean isRun, inputOperatorType;
		char operator, yesNo;

		isRun = true;

		System.out.println("계산기");

		while (isRun) {
			System.out.println("'100' 이하의 정수를 입력하세요.");
			num1 = scanner.nextInt();

			while (num1>100) {
				System.out.println("'100' 이하의 정수를 입력하세요.");
				num1 = scanner.nextInt();
			}

			System.out.println("연산자를 선택하세요.\n덧셈\'+\', 뺄셈\'-\', 곱셈\'*\', 나눗셈\'/\'");
			operator = scanner.next().charAt(0);
			inputOperatorType = true;
			while (inputOperatorType) {
				if (operator=='+') {
					inputOperatorType = !inputOperatorType;
				} else if (operator=='-') {
					inputOperatorType = !inputOperatorType;
				} else if (operator=='*') {
					inputOperatorType = !inputOperatorType;
				} else if (operator=='/') {
					inputOperatorType = !inputOperatorType;
				} else {
					System.out.println("연산자를 입력하세요.\n덧셈\'+\', 뺄셈\'-\', 곱셈\'*\', 나눗셈\'/\'");
					operator = scanner.next().charAt(0);
				}
			}

			System.out.println("'0'을 제외한 '100' 이하의 정수를 입력하세요.");
			num2 = scanner.nextInt();

			while (num2>100||num2==0) {
				System.out.println("'0'을 제외한 '100' 이하의 정수를 입력하세요.");
				num2 = scanner.nextInt();
			}

			if (operator=='+') {
				plus = num1+num2;
				System.out.println(num1+"+"+num2+"="+plus);
				System.out.println(toBinaryString((short)plus));
			}else if (operator=='-') {
				minus = num1-num2;
				System.out.println(num1+"-"+num2+"="+minus);
				System.out.println(toBinaryString((short)minus));
			}else if (operator=='*') {
				multi = num1*num2;
				System.out.println(num1+"*"+num2+"="+multi);
				System.out.println(toBinaryString((short)multi));
			}else {
				division = num1/num2;
				remain = num1%num2;
				if (num1%num2==0) {
					System.out.println(num1+"÷"+num2+"="+division);
					System.out.println(toBinaryString((short)division));
				} else {
					System.out.println(num1+"÷"+num2+"="+division+"..."+remain);
					System.out.println(toBinaryString((short)division)+"..."+
							(toBinaryString((short)remain)));
				}
			}
			System.out.println("계속하시겠습니까?\n(Y/y),(N/n)");
			yesNo = scanner.next().charAt(0);
			if (yesNo=='n'||yesNo=='N') {
				isRun = !isRun;
			}
		}
		scanner.close();
	}
	public static String toBinaryString(short s) {
		String str = Integer.toBinaryString(s);
		while (str.length()<16) {
			str = "0" + str;
		}
		return str;
	}
}
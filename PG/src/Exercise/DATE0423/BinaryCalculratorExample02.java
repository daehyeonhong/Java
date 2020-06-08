package Exercise.DATE0423;

import java.util.Scanner;

public class BinaryCalculratorExample02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, plus, minus, multi, division, remain;
		boolean isRun, inputOperatorType;
		char operator, yesNo;

		isRun = true;

		System.out.println("����");

		while (isRun) {
			System.out.println("'100' ������ ������ �Է��ϼ���.");
			num1 = scanner.nextInt();

			while (num1>100) {
				System.out.println("'100' ������ ������ �Է��ϼ���.");
				num1 = scanner.nextInt();
			}

			System.out.println("�����ڸ� �����ϼ���.\n����\'+\', ����\'-\', ����\'*\', ������\'/\'");
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
					System.out.println("�����ڸ� �Է��ϼ���.\n����\'+\', ����\'-\', ����\'*\', ������\'/\'");
					operator = scanner.next().charAt(0);
				}
			}

			System.out.println("'0'�� ������ '100' ������ ������ �Է��ϼ���.");
			num2 = scanner.nextInt();

			while (num2>100||num2==0) {
				System.out.println("'0'�� ������ '100' ������ ������ �Է��ϼ���.");
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
					System.out.println(num1+"��"+num2+"="+division);
					System.out.println(toBinaryString((short)division));
				} else {
					System.out.println(num1+"��"+num2+"="+division+"..."+remain);
					System.out.println(toBinaryString((short)division)+"..."+
							(toBinaryString((short)remain)));
				}
			}
			System.out.println("����Ͻðڽ��ϱ�?\n(Y/y),(N/n)");
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
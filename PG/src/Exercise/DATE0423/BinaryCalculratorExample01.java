package Exercise.DATE0423;

import java.util.Scanner;

public class BinaryCalculratorExample01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, plus, minus, multi, division, remain;
		boolean isRun, operatorType;
		char operator, yesNo;

		isRun = true;
		operatorType = true;

		while (isRun) {
			System.out.println("������ ������ ���� �� '100'������ ������ �Է��ϼ���.");
			num1 = scanner.nextInt();

			while (operatorType) {
				System.out.println("�����ڸ� �����ϼ���.\n����\'+\', ����\'-\', ����\'*\', ������\'/\'");
				operator = scanner.next().charAt(0);
				if (operator!='+') {

				} else if (operator!='-') {

				} else if (operator!='*') {

				} else if (operator!='/'){
					System.out.println("�����ڸ� �Է��ϼ���.");
				} else {
					operatorType =! operatorType;
				}

				System.out.println("'100' ������ ���� ������ �Է��ϼ���.");
				num2 = scanner.nextInt();

				if (num1>100||num2>100) {
					System.out.println("100 ������ ������ �Է��ϼ���.");
				}

				plus = num1 + num2;
				minus = num1 - num2;
				multi = num1 * num2;
				division = num1 / num2;
				remain = num1 % num2;

				if (operator=='+') {
					System.out.println(num1+"+"+num2+"="+plus);
					System.out.println(toBinaryString((short)plus));
				} else if (operator=='-') {
					System.out.println(num1+"-"+num2+"="+minus);
					System.out.println(toBinaryString((short)minus));
				} else if (operator=='*') {
					System.out.println(num1+"*"+num2+"="+division);
					System.out.println(toBinaryString((short)multi));
				} else if (num1%num2!=0) {
					System.out.println(num1+"/"+num2+"="+division+"..."+remain);
					System.out.println(toBinaryString((short)division)+"..."+toBinaryString((short)remain));
				} else {
					System.out.println(num1+"/"+num2+"="+division);
					System.out.println(toBinaryString((short)division));
				}

				System.out.println("��� �Ͻðڽ��ϱ�?\n�� �����Ϸ���(Y/y)\n�����Ϸ���(N/n)");
				yesNo = scanner.next().charAt(0);
				if (yesNo=='n'||yesNo=='N') {
					System.out.println("�����մϴ�.");
					isRun =! isRun;
				}
			}
		}
		scanner.close();

	}
	public static String toBinaryString(short value) {
		String str = Integer.toBinaryString(value);
		while (str.length()<8) {
			str = "0" + str;
		}
		return str;
	}
}

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
			System.out.println("이진수 연산을 진행 할 '100'이하의 정수를 입력하세요.");
			num1 = scanner.nextInt();

			while (operatorType) {
				System.out.println("연산자를 선택하세요.\n덧셈\'+\', 뺄셈\'-\', 곱셈\'*\', 나눗셈\'/\'");
				operator = scanner.next().charAt(0);
				if (operator!='+') {

				} else if (operator!='-') {

				} else if (operator!='*') {

				} else if (operator!='/'){
					System.out.println("연산자를 입력하세요.");
				} else {
					operatorType =! operatorType;
				}

				System.out.println("'100' 이하의 다음 정수를 입력하세요.");
				num2 = scanner.nextInt();

				if (num1>100||num2>100) {
					System.out.println("100 이하의 정수를 입력하세요.");
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

				System.out.println("계속 하시겠습니까?\n더 진행하려면(Y/y)\n중지하려면(N/n)");
				yesNo = scanner.next().charAt(0);
				if (yesNo=='n'||yesNo=='N') {
					System.out.println("종료합니다.");
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

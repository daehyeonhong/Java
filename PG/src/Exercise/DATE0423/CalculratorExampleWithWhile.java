//package Exercise.DATE0423;
//
//import java.util.Scanner;
//
//public class CalculratorExampleWithWhile {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		double num1, num2, plusResult, minusResult, multiplResult, divisionResult, remainResult, result;
//		boolean isRun;
//		char yesNo;
//
//		isRun = true;
//		System.out.println("����");
//
//		while (isRun) {
//			System.out.println("������ �Է��ϼ���.");
//			num1 = scanner.nextDouble();
//
//			System.out.println("�����ڸ� �����ϼ���.\n����'+', ����'-', ����'*', ������'/'");
//			String operator = scanner.next().trim();
//			//while (inputOperatorType) {
//			//	if (operator=='+'||operator=='-'||operator=='*'||operator=='/') {
//			//		if (operator=='/') {
//			//			System.out.print("0�� ������ ");
//			//		}
//			//		break;
//			//	}
//			//if (operator!='+') {
//			//	System.out.println("����"); 
//			//	continue;
//			//
//			//}
//
//			/*
//			 * if(!operator.equals("+")) ; else if(!operator.equals("-")) ; else
//			 * if(!operator.equals("*")) ; else if(!operator.equals("/")) ; else continue;
//			 */
//			if (true) {
//				
//			switch(operator) {
//			case "+":
//			case "-":
//			case "*":
//			case "/": break;
//			}
//			System.out.println("�����ڸ� �����ϼ���.\n����'+', ����'-', ����'*', ������'/'");
//			operator = scanner.next();
//			System.out.println("���Ӱ� ���� �� 111");
//			}
//			System.out.println("���� ���� ���");
//
//			//System.out.println("�����ڸ� �Է��ϼ���");
//			//operator = scanner.next().charAt(0);
//
//
//			System.out.println("������ �Է��ϼ���.");
//
//			num2 = scanner.nextDouble();
//			if(Double.isNaN(num2)) {
//				continue;
//			}
//			
//			if (operator.equals("/")&&(num2==0)) {
//				System.out.println("0���δ� ���� �� �����ϴ�. �ٸ� ������ �Է��ϼ���.");
//			}
//
//
//			plusResult = num1 + num2;	
//			minusResult = num1 - num2;
//			multiplResult = num1 * num2;
//			divisionResult = num1 / num2;
//			remainResult = num1 % num2;
//
//			if (operator.equals("/")&&(num1%num2!=0)) {
//				System.out.println(divisionResult+"..."+remainResult);
//			} else if (operator.equals("+")) {
//				System.out.println(plusResult);
//			} else if (operator.equals("-")) {
//				System.out.println(minusResult);
//			} else if (operator.equals("*")) {
//				System.out.println(multiplResult);
//			} else {
//				System.out.println(divisionResult);
//			}
//			System.out.println("��� �����Ͻðڽ��ϱ�?\n(Y/y),(N/n)");
//			yesNo = scanner.next().charAt(0);
//			if (yesNo=='n' ||yesNo=='N') {
//				isRun = !isRun;				
//			}
//			/*
//			 * if (operator=='/'&num2=='0') {
//			 * System.out.println("0���δ� ���� �� �����ϴ�. �ٸ� ������ �Է��ϼ���."); }
//			 */
//		}
//		scanner.close();
//	}
//}

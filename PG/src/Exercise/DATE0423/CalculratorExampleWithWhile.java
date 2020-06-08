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
//		System.out.println("계산기");
//
//		while (isRun) {
//			System.out.println("정수를 입력하세요.");
//			num1 = scanner.nextDouble();
//
//			System.out.println("연산자를 선택하세요.\n덧셈'+', 뺄셈'-', 곱셈'*', 나눗셈'/'");
//			String operator = scanner.next().trim();
//			//while (inputOperatorType) {
//			//	if (operator=='+'||operator=='-'||operator=='*'||operator=='/') {
//			//		if (operator=='/') {
//			//			System.out.print("0을 제외한 ");
//			//		}
//			//		break;
//			//	}
//			//if (operator!='+') {
//			//	System.out.println("오류"); 
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
//			System.out.println("연산자를 선택하세요.\n덧셈'+', 뺄셈'-', 곱셈'*', 나눗셈'/'");
//			operator = scanner.next();
//			System.out.println("새롭게 받은 값 111");
//			}
//			System.out.println("받은 값을 출력");
//
//			//System.out.println("연산자를 입력하세요");
//			//operator = scanner.next().charAt(0);
//
//
//			System.out.println("정수를 입력하세요.");
//
//			num2 = scanner.nextDouble();
//			if(Double.isNaN(num2)) {
//				continue;
//			}
//			
//			if (operator.equals("/")&&(num2==0)) {
//				System.out.println("0으로는 나눌 수 없습니다. 다른 정수를 입력하세요.");
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
//			System.out.println("계속 진행하시겠습니까?\n(Y/y),(N/n)");
//			yesNo = scanner.next().charAt(0);
//			if (yesNo=='n' ||yesNo=='N') {
//				isRun = !isRun;				
//			}
//			/*
//			 * if (operator=='/'&num2=='0') {
//			 * System.out.println("0으로는 나눌 수 없습니다. 다른 정수를 입력하세요."); }
//			 */
//		}
//		scanner.close();
//	}
//}

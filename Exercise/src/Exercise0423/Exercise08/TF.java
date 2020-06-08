package Exercise0423.Exercise08;

import java.util.Scanner;

public class TF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char a, operator;
		boolean inputOperatorType = true;

		a = scanner.next().charAt(0);
		if (a=='%'||a=='!'||a=='$'||a=='*') {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

		operator = scanner.next().charAt(0);

		while (inputOperatorType) {
			if (operator!='+'||operator!='-'||operator!='*'||operator!='/') {
				System.out.println("성공");
				if (operator=='/') {
					System.out.print("0을 제외한 ");
				}
				break;
			}
			if (operator == '+') {
				System.out.println("오류"); 
				break;

			}
			scanner.close();
		}
	}
}
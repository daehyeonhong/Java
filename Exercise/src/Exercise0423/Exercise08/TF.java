package Exercise0423.Exercise08;

import java.util.Scanner;

public class TF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char a, operator;
		boolean inputOperatorType = true;

		a = scanner.next().charAt(0);
		if (a=='%'||a=='!'||a=='$'||a=='*') {
			System.out.println("����");
		} else {
			System.out.println("����");
		}

		operator = scanner.next().charAt(0);

		while (inputOperatorType) {
			if (operator!='+'||operator!='-'||operator!='*'||operator!='/') {
				System.out.println("����");
				if (operator=='/') {
					System.out.print("0�� ������ ");
				}
				break;
			}
			if (operator == '+') {
				System.out.println("����"); 
				break;

			}
			scanner.close();
		}
	}
}
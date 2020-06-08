
package Test0427.Test003;

public class Test003 {
	public static void main(String[] args) {
		int num1, num2, primeNumber;
		boolean isRun;
		for (num1 = 2; num1 <= 100; num1++) {
			isRun = true;
			while (isRun) {
				primeNumber = 0;
				for (num2 = num1 - 1; num2 >= 2;) {
					if (num1 % num2 == 0) {
						primeNumber++;
					}
					num2--;
				}
				if (primeNumber == 0) {
					System.out.println(num1);
					isRun = !isRun;
				}
				break;
			}
		}
	}
}
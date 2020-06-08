package Test.DATE0428;

/*1. 3,6,9 게임
- 1부터 10까지의 정수중 3,6,9의 배수가 되는수면 "짝" 
- 33 "짝짝"*/
public class Game369 {
	public static void main(String[] args) {
		int sum = 0;
		for (int num10 = 0; num10 <= 10; num10++) {
			for (int num1 = 0; num1 < 10; num1++) {
				sum = 10 * num10 + num1;
				System.out.print(sum);
				if (sum == 100) {
					break;
				}
				if (num1 % 3 == 0 & num1 != 0) {
					System.out.print("짝");
				}
				if (num10 % 3 == 0 & num10 != 0) {
					System.out.print("짝");
				}
				System.out.println();
			}
		}
	}
}
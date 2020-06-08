package Exercise0427.Exercise04;

public class Exercise04 {
	public static void main(String[] args) {
		int dice1, dice2, sum;
		boolean isRun = true;
		while (isRun) {
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			sum = dice1 + dice2;
			System.out.println(dice1 + "+" + dice2 + "=" + sum);
			if (sum == 5) {
				isRun = !isRun;
			}
		}
	}
}
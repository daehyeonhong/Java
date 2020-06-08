package Test0427R.Test01;

//369°ÔÀÓ
public class Test01 {
	public static void main(String[] args) {
		int sum;
		for (int i = 0; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				sum = 10 * i + j;
				if (sum > 100)
					break;
				System.out.print(sum);
				System.out.println();
			}
		}
	}
}
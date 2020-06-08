package Test0427.Test001;

public class Test001 {
	public static void main(String[] args) {
		int sum;
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; ++j) {
				sum = (10 * i) + j;
				if (sum > 100) {
					break;
				}
				System.out.println(10 * i + j);
				if ((j == 3 || j == 6 || j == 9) || (i == 3 || i == 6 || i == 9)) {

					System.out.print("¦");
					if ((j == 3 || j == 6 || j == 9) && (i == 3 || i == 6 || i == 9)) {

						System.out.print("¦");
					}
					System.out.println();
				}
			}
		}
	}
}
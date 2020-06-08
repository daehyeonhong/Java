package ch02;

public class BreakLabelExample {
	public static void main(String[] args) {
		kk: for (int i = 0; i < 9;i++) {
			for (int j = 0; j < 9; j++) {
				if (j == 5) {
					break kk;
				}
				System.out.print(i + "," + j + "\t");
			}
			System.out.println();
		}
	}
}
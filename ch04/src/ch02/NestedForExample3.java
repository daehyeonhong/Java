package ch02;

public class NestedForExample3 {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if (i==10) {
				break;
			}
			for (int j = 1; j <= 100; j++) {
				if (j==10) {
					break;
				}
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}
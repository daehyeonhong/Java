package Exercise0427.Exercise06;

public class Exercise06 {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			char star = '*';
			System.out.print(star);
			for (int j = 0; j < i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
}
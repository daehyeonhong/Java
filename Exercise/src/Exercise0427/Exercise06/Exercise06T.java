package Exercise0427.Exercise06;

//for문을 이용해서 별표 찍기.
public class Exercise06T {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
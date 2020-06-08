package Test0427.Test003;

public class PrimeNumber1To1000 {
	public static void main(String[] args) {
		int count;
		System.out.println("2부터 100사이의 모든 소수: ");
		for (int i = 2; i <= 1000; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if ((i % j) == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}
}
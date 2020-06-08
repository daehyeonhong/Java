package Exercise0427.Exercise00;

public class ContinueExam {
	public static void main(String[] args) {
		long sum = 0;

		for (long i = 1; i <= 1000; i++) {
			if (i % 3 == 0 || i % 4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		long sum3 = 0;
		for (long i = 1; i <= 10000; i++) {
			if (i % 3 == 0 ) {
				sum3 += i;
			}
		}
		System.out.println(sum3);
		
		long sum4 = 0;
		for (long i = 1; i <= 10000; i++) {
			if (i % 4 == 0) {
				sum4 += i;
			}
		}
		System.out.println(sum4);
		
		long sum3P4 = sum3 + sum4;
		System.out.println(sum3P4);
	}
}
package sec02.exam02;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i;
		for(i=1; i<=5000; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + "гу: " + sum);
	}
}

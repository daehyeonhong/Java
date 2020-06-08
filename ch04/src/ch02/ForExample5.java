package ch02;

public class ForExample5 {
	public static void main(String[] args) {
		for(int i = 0, sum = 0; i<=100; i++,System.out.println("sum="+sum)) {
			sum=sum+i;
		}
	}
}
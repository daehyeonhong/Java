package ch02;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = .0;
		
		double z=x/y;
		//double z = x%y;
		//z = x%y;
		
		//Wrapper Å¬·¡½º Double
		System.out.println(Double.isInfinite(z));//Infinity
		System.out.println(Double.isNaN(z));
		
		System.out.println(z+2);//Infinity + 2
	}
}

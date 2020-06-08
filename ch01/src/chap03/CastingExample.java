package chap03;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;//casting int -> char
		System.out.println(charValue);
		
		for(int i = 0; i < 10; i++) {
			intValue = intValue + 1;
			System.out.println((char)intValue);
			intValue++;
		}
		
		long longValue = 500;
		intValue = (int)longValue;//casting long -> int
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;//casting double -> int
		System.out.println(intValue);
	}
}

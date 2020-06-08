package chap03;

public class TypeConversionExam {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b+i);//byte + int => int + int => int
		System.out.println(10/4);//int / int => int
		System.out.println(10.0/4);//double /int => double/double => double
		System.out.println((char)0x12340041);// int => char
		System.out.println((byte)(b+i));//int => byte
		System.out.println((int)2.9+1.8);//double + double => double => int
		System.out.println((int)(2.9+1.8));//int + double => double
		System.out.println((int)2.9+(int)1.8);// int + int => int
	}
}

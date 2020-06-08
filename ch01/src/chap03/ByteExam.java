package chap03;

public class ByteExam {
	public static void main(String[] args) {
		byte b = 127;
		byte c = 1;
		
		System.out.println((byte)b+c);
		
		for (int i=0;i<128;i++) {
			System.out.println(b);
			b++;//b = b + 1
		}
	}
}

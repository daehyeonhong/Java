package Exercise0612.Exercise006;

public class Ex06MainExample {
	public static void main(String[] args) {
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };// byte값, ASCIICode값
		String str = new String(bytes);
		System.out.println(str);
	}
}

package ch02;

public class DoWhileExample1 {
	public static void main(String[] args) {
		char c = 'a';

		do {
			System.out.print(c);
			c = (char) (c + 1);//(char)(97+1) => 'b'
			System.out.print("\t");
		} while (c <= 'z');// c <= 122
	}
}
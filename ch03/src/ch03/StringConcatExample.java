package ch03;

public class StringConcatExample {
	public static void main(String[] args) {
		System.out.println("JDK"+3+3.0);
		System.out.println(3+3.0+"JDK");
		System.out.println("JDK"+(3+3.0));//괄호()연산이 우선
	}
}

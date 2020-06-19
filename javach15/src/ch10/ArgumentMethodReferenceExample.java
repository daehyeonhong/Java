package ch10;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceExample {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function1, function2, function3;

		function1 = new ToIntBiFunction<String, String>() {

			@Override
			public int applyAsInt(String t, String u) {
				return t.compareToIgnoreCase(u);
			}
		};
		print(function1.applyAsInt("Java8", "JAVA8"));

		function2 = String::compareToIgnoreCase;
		print(function2.applyAsInt("Java8", "Kava8"));

		function3 = String::compareToIgnoreCase;
		print(function3.applyAsInt("Java8", "JAVA8"));

	}

	public static void print(int order) {
		if (order < 0) {
			System.out.println("사전순으로 먼저 나옵니다");
		} else if (order == 0) {
			System.out.println("동일한 문자열입니다");
		} else {
			System.out.println("사전순으로 나중에 옵니다.");
		}
	}
}
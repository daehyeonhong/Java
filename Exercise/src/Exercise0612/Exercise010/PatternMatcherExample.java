package Exercise0612.Exercise010;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id1 = "5Angel1004";
		String regExp = "[a-zA-Z]\\w{7,11}";
		boolean isMatch = Pattern.matches(regExp, id1);

		System.out.println(id1 + "의 길이: " + id1.length());
		System.out.print("id1: " + id1 + "은(는) ");

		if (isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}

		String id2 = "Aasdas2e";
		String regExp2 = "[a-zA-Z]\\w{7,11}";
		boolean isMatch2 = Pattern.matches(regExp2, id2);

		System.out.println(id2 + "의 길이: " + id2.length());
		System.out.print("id2: " + id2 + "은(는) ");

		if (isMatch2) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}
}
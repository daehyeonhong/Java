package Exercise0612.Exercise010;

import java.util.regex.Pattern;

public class Ex10MainExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[^a-ZA-Z]\\w{8,12}";
		boolean isMatch = Pattern.matches(regExp, id);
		if (isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}
}
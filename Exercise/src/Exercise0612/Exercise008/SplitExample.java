package Exercise0612.Exercise008;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";

		// 방법1 (split() 메소드 이용);
		String[] strs = str.split(",");

		for (String text : strs) {
			System.out.println(text.toString());
		}

		System.out.println("──────");
		// 방법2 (StringTokenizer 이용)
		StringTokenizer stk = new StringTokenizer(str, ",");
		int countTokens = stk.countTokens();

		for (int i = 0; i < countTokens; i++) {
			System.out.println(stk.nextToken());
		}
	}
}
package Exercise0612.Exercise008;

import java.util.StringTokenizer;

public class Ex08MainExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";

		// String[] 변수 = str.split("구분자");
		String[] strs = str.split(",");

		for (String s : strs) {
			System.out.println(s);
		}

		StringTokenizer stk = new StringTokenizer(str, ",");
		while (stk.hasMoreElements()) {
			System.out.println(stk.nextElement());
		}
	}
}
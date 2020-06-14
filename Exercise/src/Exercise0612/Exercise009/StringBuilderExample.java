package Exercise0612.Exercise009;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i < 100; i++) {
			str += i;
		}
		System.out.println(str);

		// 개선 코드 작성 위치
		String str2 = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 100; i++) {
			sb.append(str2 + i);
		}
		str2 = sb.toString();
		System.out.println(str2);
	}
}
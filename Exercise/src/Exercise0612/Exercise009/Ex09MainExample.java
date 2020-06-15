package Exercise0612.Exercise009;

public class Ex09MainExample {
	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 100; i++) {
			str += i;
		}

		// 최종 생성된 String객체의 갯수 100개
		System.out.println(str);// 1,12,123,1234,12345,123456,...

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i);
		}

		// 최종 생성된 StringBuilder 객체의 갯수 1개
		System.out.println(sb.toString());
	}
}
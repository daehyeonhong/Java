package Test0427.Test001;

public class Test001T {
	public static void main(String[] args) {
		String res = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
					res = "¦";
				}
				res = res + "¦";
			}
			System.out.println(i + "-" + res);
			res = "";
		}
	}
}
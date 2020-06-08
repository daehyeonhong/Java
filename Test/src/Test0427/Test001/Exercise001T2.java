package Test0427.Test001;

public class Exercise001T2 {
	public static void main(String[] args) {
		String res = "";
		for (int i = 1; i <= 100; i++) {
			if ((i / 10) % 3 == 0 & (i / 10) != 0) {
				res = "¦";
			}

			if ((i % 10) % 3 == 0 & (i % 10) != 0) {

				res = res + "¦";
			}

			System.out.println(i + "-" + res);
			res = "";
		}
	}
}
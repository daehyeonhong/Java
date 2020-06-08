package ch03;

public class LogicalExpressExample {
	public static void main(String[] args) {
		// ³í¸® °ö
		int x = -1, y = -1;
		
		if (++x == 1 && x / (++y) == 1) {
			System.out.println("z");
		} else {
			System.out.println("a");
			System.out.println("x: " + x + ", y: " + y);
		}

		if (++x == 1 || x / ++y == 1) {// 1/0 exception
			System.out.println("zZ");
			System.out.println("x: " + x + ", y: " + y);
		} else {
			System.out.println("aA");
		}
		
	}
}
package ch04;

public class IfExample {
	public static void main(String[] args) {
		int i = 11;
		if (i % 2 == 0) {
			System.out.println("礎熱");
		}

		if (i % 2 == 0) {
			System.out.println("礎熱");
		} else {
			System.out.println("�汝�");
		}

		if (i % 2 == 0) {
			System.out.println("2曖 寡熱");
		} else if (i % 3 == 0) {
			System.out.println("3曖 寡熱");
		} else if (i % 5 == 0) {
			System.out.println("5曖 寡熱");
		} else {
			System.out.println("路塭");
		}
	}
}
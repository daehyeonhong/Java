package ch04;

public class IfExample {
	public static void main(String[] args) {
		int i = 11;
		if (i % 2 == 0) {
			System.out.println("¦��");
		}

		if (i % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

		if (i % 2 == 0) {
			System.out.println("2�� ���");
		} else if (i % 3 == 0) {
			System.out.println("3�� ���");
		} else if (i % 5 == 0) {
			System.out.println("5�� ���");
		} else {
			System.out.println("����");
		}
	}
}
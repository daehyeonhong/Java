package Test0507.TestFruitMk2;

import java.util.Scanner;

//Scanner�� ���� �Է¹޾Ƽ� Fruit��ü�� �����Ͽ� �迭�� �����ϰ�,
//�Ǹż����� ���� �������� ����
//�Ǹŷ��� ���� ���� ���ϰ�
//�Ǹŷ��� ���� ���� ������ ���
//�Ѽ��Ǹžװ� ����Ǹž��� ���
public class FruitMainExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String kind;
		int price;
		int sale;
		int totalPrice = 0;
		String brixSrt;
		boolean run;

		Fruit[] fruits = new Fruit[4];
		// �Ǹż���
		for (int i = 0; i < fruits.length; i++) {
			System.out.print("ǰ���� �Է��ϼ���> ");
			kind = scanner.next();
			System.out.print("������ �Է��ϼ���> ");
			price = scanner.nextInt();
			System.out.print("�絵�� �����ϼ���\r[HIGH/MEDIUM/LOW]");
			brixSrt = scanner.next();
			run = true;

			while (run) {
				switch (brixSrt) {
				case "HIGH":
					run = !run;
					break;
				case "MEDIUM":
					run = !run;
					break;
				case "LOW":
					run = !run;
					break;

				default:
					System.out.print("�絵�� �����ϼ���\r[HIGH/MEDIUM/LOW]");
					brixSrt = scanner.next();
					break;
				}
			} // while�� ��
			fruits[i] = new Fruit(kind, price, brixSrt);
			System.out.print("�Ǹŷ��� �Է��ϼ���>");
			sale = scanner.nextInt();
			fruits[i].setSale(sale);
		} // fruits �迭 ��ü �� �Է�

		// �������� ����
		Fruit[] fruitAsd = new Fruit[1];
		for (int i = 0; i < fruits.length; i++) {
			for (int j = 0; j < i; j++) {
				if (fruits[j].getSale() > fruits[i].getSale()) {
					fruitAsd[0] = fruits[i];
					fruits[i] = fruits[j];
					fruits[j] = fruitAsd[0];
				}
			}
		}
		System.out.println("=========================================================");
		System.out.println("\t\t�������� ����");
		for (Fruit f : fruits) {// �������� ����
			System.out.println(f);
		}

		// �ִ� �ּ� ��
		// Fruit[] max = { new Fruit(null, 0, null) };
		// Fruit[] min = { new Fruit(null, 0, null) };
		// for (int i = 0; i < fruits.length; i++) {
		// if (max[0].getSale() < fruits[i].getSale()) {
		// max[0] = fruits[i];
		// }
		// if (min[0].getSale() > fruits[i].getSale()) {
		// min[0] = fruits[i];
		// }
		// }
		// System.out.println("�Ǹŷ��� ���� ���� ����" + max[0].getKind());
		// System.out.println("�Ǹŷ��� ���� ���� ����" + min[0].getKind());

		// ���� �Ǹ�,�ְ� �Ǹ�
		int min = 100000;
		int max = 0;
		for (int i = 0; i < fruits.length; i++) {
			for (int j = 0; j < fruits.length; j++) {
				if (min > fruits[j].getSale()) {
					min = fruits[j].getSale();
				}
				if (max < fruits[j].getSale()) {
					max = fruits[j].getSale();
				}
			}
			if (fruits[i].getSale() == min) {
				System.out.println("�Ǹŷ��� ���� ���� ����> " + fruits[i].getKind());
			}
			if (fruits[i].getSale() == max) {
				System.out.println("�Ǹŷ��� ���� ���� ����> " + fruits[i].getKind());
			}
		}

		// �� �Ǹž�, ��� �Ǹž�
		for (int i = 0; i < fruits.length; i++) {
			totalPrice += (fruits[i].getPrice() * fruits[i].getSale());
		}
		System.out.println("�� �Ǹž�>" + totalPrice + " ��");
		System.out.println("��� �Ǹž�>" + Math.round((double) totalPrice / fruits.length) + " ��");
		scanner.close();
	}
}
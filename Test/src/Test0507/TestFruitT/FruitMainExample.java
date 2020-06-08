package Test0507.TestFruitT;

import java.util.Scanner;

//Scanner�� ���� �Է¹޾Ƽ� Fruit��ü�� �����Ͽ� �迭�� �����ϰ�,
//�Ǹż����� ���� �������� ����
//�Ǹŷ��� ���� ���� ���ϰ�
//�Ǹŷ��� ���� ���� ������ ���
//�Ѽ��Ǹžװ� ����Ǹž��� ���
public class FruitMainExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Fruit[] fruits = new Fruit[4];

		for (int i = 0; i < fruits.length; i++) {
			System.out.println("���ϸ��� �Է��ϼ���> ");
			String kind = scanner.next();
			System.out.println("������ �Է��ϼ���> ");
			int price = scanner.nextInt();
			System.out.println("�絵(LOW, MEDIUM, HIGH)�� �Է��ϼ���> ");
			String brix = scanner.next();

			Fruit fruit = new Fruit(kind, price, Brix.valueOf(brix));
			fruits[i] = fruit;
		}

		// Fruit f = fruits[0]; f.setSale(20);
		// System.out.println("���Ϻ� �Ǹ� ���� �Է�");
		// System.out.println("������ �Է��ϼ���> ");
		// int sale = scanner.nextInt();
		// fruits[0].setSale(sale);
		// System.out.println("������ �Է��ϼ���> ");
		// sale = scanner.nextInt();
		// fruits[1].setSale(sale);
		// System.out.println("������ �Է��ϼ���> ");
		// sale = scanner.nextInt();
		// fruits[2].setSale(sale);
		// System.out.println("������ �Է��ϼ���> ");
		// sale = scanner.nextInt();
		// fruits[3].setSale(sale);
		System.out.println("���Ϻ� �Ǹ� ���� �Է�");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i].getKind() + "�� ������ �Է��ϼ���> ");
			int sale = scanner.nextInt();
			fruits[i].setSale(sale);
		}
		System.out.println("���� ���");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i].toString());
		}

		double tot = 0;
		// �������� ����
		for (int i = 0; i < fruits.length; i++) {
			for (int j = i + 1; j < fruits.length; j++) {
				if (fruits[i].getSale() > fruits[j].getSale()) {
					Fruit f = fruits[i];
					fruits[i] = fruits[j];
					fruits[j] = f;
				}
			}
		}

		// ����
		for (int i = 0; i < fruits.length; i++) {
			tot += fruits[i].getPrice() * fruits[i].getSale();
		}

		System.out.println("���� �� ���� ���");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i].toString());
		}

		System.out.println("�ּ� �Ǹŷ� ���� ����: " + fruits[0]);
		System.out.println("�ִ� �Ǹŷ� ���� ����: " + fruits[fruits.length - 1]);
		System.out.println("�� �Ǹž�: " + tot);
		System.out.println("��� �Ǹž�:" + tot / fruits.length);
		scanner.close();
	}
}
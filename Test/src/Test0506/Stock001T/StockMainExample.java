package Test0506.Stock001T;

import java.util.Scanner;

public class StockMainExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// StockŬ����(���赵)�� �´� �ν��Ͻ� ����
		// Ÿ�� ���� = new Ÿ��();
		Stock stock = new Stock();

		// �޼ҵ� �����Ͽ� stock�ν��Ͻ��� �Ӽ� �� ����
		// stock.item = "apple";
		System.out.print("��ǰ���� �Է��ϼ���> ");
		String item = scanner.next();
		stock.setItem(item);
		System.out.print("��ǰ ������ �Է��ϼ���> ");
		int amount = scanner.nextInt();
		stock.setQty(amount);

		double qty = stock.getQty();
		// qty = stock.qty;
		System.out.print("�����: " + qty);

		System.out.print("��� ������ �Է��ϼ���> ");
		amount = scanner.nextInt();
		stock.outQty(amount);
		qty = stock.getQty();
		System.out.println("�����: " + qty);

		scanner.close();
	}
}
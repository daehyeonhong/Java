package Test0506.Stock;

public class Stock {
	String item;
	double qty,set, get;
	
	Stock() {
		System.out.print("ǰ���� �Է��ϼ���: ");
	}

	void setItem(String item) {
		this.item = item;
		System.out.print("������ �Է��ϼ���: ");
	}

	void setQty(double qty) {
		this.qty += qty;
		System.out.println(item+" ǰ���� ���� "+qty+"�� �����ϰ� �ֽ��ϴ�.");
		System.out.println("���:1\t�԰�:2");
	}

	void getQty(double get) {
		this.get = get;
		if (qty - get < 0) {
			System.out.println("��� �����մϴ�.");
			return;
		} else {
			qty -= get;
			System.out.println(qty + "�� ���ҽ��ϴ�.");
		}
	}
}
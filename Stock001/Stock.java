package Test0506.Stock001;

import java.util.Scanner;

/*StockŬ����
String item;
double qty;

Stock(){
}
public setItem(String item){
 this.item=item;
}

// �������޼ҵ�
// ���� ���+amout;
void setQty(int amount){

}

double getQty(){
   return qty;
}

// ���޼ҵ�
//ĸ��ȭ�� �̿��Ͽ� �޼ҵ带 �ϼ��ϰ� 
//StockMainExamŬ��������
//scanner�� �̿��Ͽ�, ��� ��/��� �غ�����. 
void outQty(){
}
 */
public class Stock {
	Scanner scanner = new Scanner(System.in);
	String item;
	int choose;
	int qty;

	Stock() {
		System.out.print("������ ǰ���� �Է��ϼ���> ");
	}

	void setItem() {
		String item = scanner.next();
		this.item = item;
		System.out.println(item + "��(��) ���� ���Դϴ�.");
	}

	void choose() {
		boolean run = true;
		while (run) {
			System.out.println("�۾��� �����ϼ���.\r�԰�(0),\t���(1),\t����(2)");
			int choose = scanner.nextInt();
			this.choose = choose;
			switch (choose) {
			case 0:
				setQty();
				break;
			case 1:
				getQty();
				break;

			case 2:
				System.out.println("�����մϴ�.");
				run = !run;
			}
		}
	}

	void setQty() {
		System.out.print("�� ���� �԰��Ͻðڽ��ϱ�?");
		int set = scanner.nextInt();
		this.qty += set;
		System.out.println(item + set + "���� �԰��Ͽ� " + qty + "���� ���� ���Դϴ�.");
	}

	void getQty() {
		System.out.print("�� ���� ����Ͻðڽ��ϱ�?");
		int get = scanner.nextInt();
		if (qty > get) {
			this.qty -= get;
			System.out.println(item + get + "���� ����Ͽ� " + qty + "���� ���� ���Դϴ�.");
		} else {
			System.out.println(qty + "�� ���� �� ���� ���� ����� �� �����ϴ�.");
			return;
		}
	}
}
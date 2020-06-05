package Exercise0507.Fruit1;

import Exercise0507.Fruit2.Brix;

//Bean ���� ��Ģ
//Ŭ���� �Ӽ��� private�� ĸ��ȭ
//������,
//�޼ҵ�� get+�Ӽ���, set+�Ӽ����� ����
public class Fruit extends Object {
	// �ʵ�
	private String kind;
	private int price;
	private Brix brix;

	// ������
	public Fruit() {

	}

	public Fruit(String kind) {
		super();
		this.kind = kind;
	}

	public Fruit(String kind, int price) {
		this.kind = kind;
		this.price = price;
	}

	public Fruit(String kind, int price, Brix brix) {
		this.kind = kind;
		this.price = price;
		this.brix = brix;
	}

	// �޼ҵ�
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Brix getBrix() {
		return brix;
	}

	public void setBrix(Exercise0507.Fruit1.Brix brix) {
		this.brix = brix;
	}

	@Override//������������ �˸��� �ּ�
	public String toString() {
		return "Fruit [kind=" + kind + ", price=" + price + ", brix=" + brix + "]";
	}

}
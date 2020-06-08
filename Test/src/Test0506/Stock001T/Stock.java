package Test0506.Stock001T;

//Ŭ������ instance�� ����� ���� ����
public class Stock {

	@SuppressWarnings("unused")
	private String item;// ���� ������ private�� ���� ����
	private double qty;// ���� ������ private�� ���� ����

	Stock() {
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setQty(int amount) {
		qty = amount;
	}

	public void inStock(int amount) {
		qty += amount;
	}

	public double getQty() {
		return qty;
	}

	public void outQty(double amount) {
		if (qty - amount < 0) {
			return;
		}
		qty -= amount;
	}
}
package Test0506.Stock001T;

//클래스는 instance를 만들기 위한 설계
public class Stock {

	@SuppressWarnings("unused")
	private String item;// 접근 제한자 private로 접근 제한
	private double qty;// 접근 제한자 private로 접근 제한

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
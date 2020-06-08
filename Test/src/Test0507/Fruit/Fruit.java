package Test0507.Fruit;

public class Fruit extends Object {
	// 필드
	private String kind;
	private int price;
	private Brix brix;

	private int sale;// 판매수량
	// 생성자3개짜리

	public Fruit(String kind, int price, Brix brix) {
		this.kind = kind;
		this.price = price;
		this.brix = brix;
	}

	// 메소드
	@Override
	public String toString() {
		return "Fruit [kind=" + kind + ", price=" + price + ", brix=" + brix + ", sale=" + sale + "]";
	}

	// 개별속성 출력
	public String getKind() {
		return kind;
	}

	public int getPrice() {
		return price;
	}

	public Brix getBrix() {
		return brix;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

}

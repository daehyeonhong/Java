package Exercise0507.Fruit1;

import Exercise0507.Fruit2.Brix;

//Bean 생성 규칙
//클래스 속성은 private로 캡슐화
//생성자,
//메소드는 get+속성명, set+속성명을 지정
public class Fruit extends Object {
	// 필드
	private String kind;
	private int price;
	private Brix brix;

	// 생성자
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

	// 메소드
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

	@Override//재정의했음을 알리는 주석
	public String toString() {
		return "Fruit [kind=" + kind + ", price=" + price + ", brix=" + brix + "]";
	}

}
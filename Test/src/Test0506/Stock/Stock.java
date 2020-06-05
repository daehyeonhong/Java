package Test0506.Stock;

public class Stock {
	String item;
	double qty,set, get;
	
	Stock() {
		System.out.print("품목을 입력하세요: ");
	}

	void setItem(String item) {
		this.item = item;
		System.out.print("수량을 입력하세요: ");
	}

	void setQty(double qty) {
		this.qty += qty;
		System.out.println(item+" 품목을 현재 "+qty+"개 보유하고 있습니다.");
		System.out.println("출고:1\t입고:2");
	}

	void getQty(double get) {
		this.get = get;
		if (qty - get < 0) {
			System.out.println("재고가 부족합니다.");
			return;
		} else {
			qty -= get;
			System.out.println(qty + "개 남았습니다.");
		}
	}
}
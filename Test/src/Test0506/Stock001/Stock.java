package Test0506.Stock001;

import java.util.Scanner;

/*Stock클래스
String item;
double qty;

Stock(){
}
public setItem(String item){
 this.item=item;
}

// 재고저장메소드
// 기존 재고+amout;
void setQty(int amount){

}

double getQty(){
   return qty;
}

// 출고메소드
//캡슐화를 이용하여 메소드를 완성하고 
//StockMainExam클래스에서
//scanner를 이용하여, 재고를 입/출고 해보세요. 
void outQty(){
}
 */
public class Stock {
	Scanner scanner = new Scanner(System.in);
	private String item;
	private int qty;

	Stock() {
		System.out.print("보관할 품목을 입력하세요> ");
	}

	void setItem() {
		String item = scanner.next();
		this.item = item;
		System.out.println(item + "을(를) 보관 중입니다.");
	}

	void choose() {
		boolean run = true;
		while (run) {
			System.out.println("작업을 선택하세요.\r입고(0),\t출고(1),\t종료(2)");
			int choose = scanner.nextInt();
			switch (choose) {
			case 0:
				setQty();
				break;
			case 1:
				getQty();
				break;

			case 2:
				System.out.println("종료합니다.");
				run = !run;
			}
		}
	}

	void setQty() {
		System.out.print("몇 개를 입고하시겠습니까?");
		int amount = scanner.nextInt();
		this.qty += amount;
		System.out.println(item + amount + "개를 입고하여 " + qty + "개를 보관 중입니다.");
	}

	void getQty() {
		System.out.print("몇 개를 출고하시겠습니까?");
		int get = scanner.nextInt();
		if (qty >= get) {
			this.qty -= get;
			System.out.println(item + get + "개를 출고하여 " + qty + "개를 보관 중입니다.");
		} else {
			System.out.println(qty + "개 보다 더 많은 양을 출고할 수 없습니다.");
			return;
		}
	}
}
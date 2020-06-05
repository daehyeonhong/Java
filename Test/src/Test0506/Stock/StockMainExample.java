package Test0506.Stock;

import java.util.Scanner;

public class StockMainExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String item = "";
		int playRun = 0;
		boolean run = true;
		double qty = 0.0;
		double get = 0.0;
		
		Stock stk = new Stock();
		
		
		item = scanner.next();
		stk.setItem(item);
		
		
		qty = scanner.nextDouble();
		stk.setQty(qty);
				
		get = scanner.nextDouble();
		stk.getQty(get);
		
		if (run) {
			System.out.println("몇 개를 입고할까요?");
			qty = scanner.nextDouble();
			stk.setQty(qty);
		} else {
			System.out.println("몇 개를 출고할까요?");
			get = scanner.nextDouble();
			stk.getQty(get);
		}
	}
}
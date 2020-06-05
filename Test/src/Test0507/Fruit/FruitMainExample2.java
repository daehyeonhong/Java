package Test0507.Fruit;

import java.util.Scanner;

//Scanner로 값을 입력받아서 Fruit객체를 생성하여 배열에 저장하고,
//판매수량에 따른 오름차순 정렬
//판매량이 가장 적은 과일과
//판매량이 가장 많은 과일을 출력
//총수판매액과 평균판매액을 출력
public class FruitMainExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String kind;
		int price;
		int sale;
		int totalSale = 0;
		int totalPrice = 0;
		String brixSrt = null;
		boolean run = true;

		Fruit[] fruits = new Fruit[4];
		// 판매수량
		for (int i = 0; i < fruits.length; i++) {
			System.out.print("품목을 입력하세요> ");
			kind = scanner.next();
			System.out.print("가격을 입력하세요> ");
			price = scanner.nextInt();
			System.out.print("당도를 선택하세요\r[HIGH/MEDIUM/LOW]");
			brixSrt = scanner.next();
			run = true;

			while (run) {
				switch (brixSrt) {
				case "HIGH":
					run = !run;
					break;
				case "MEDIUM":
					run = !run;
					break;
				case "LOW":
					run = !run;
					break;

				default:
					System.out.print("당도를 선택하세요\r[HIGH/MEDIUM/LOW]");
					brixSrt = scanner.next();
					break;
				}
			} // while문 끝
			fruits[i] = new Fruit(kind, price, brixSrt);
			System.out.print("판매량을 입력하세요>");
			sale = scanner.nextInt();
			fruits[i].setSale(sale);
		} // fruits 배열 객체 값 입력

		Fruit[] fruitAsd = new Fruit[1];
		for (int i = 0; i < fruits.length; i++) {
			for (int j = 0; j < i; j++) {
				if (fruits[j].getSale() > fruits[i].getSale()) {
					fruitAsd[0] = fruits[i];
					fruits[i] = fruits[j];
					fruits[j] = fruitAsd[0];
				}
			}
		}
		System.out.println("오름차순 정렬");
		for (Fruit f : fruits) {// 오름차순 정렬
			System.out.println(f);
		}
		// 최대 최소 값
		Fruit[] max = { new Fruit(null, 0, null) };
		Fruit[] min = { new Fruit(null, 0, null) };
		for (int i = 0; i < fruits.length; i++) {
			if (max[0].getSale() < fruits[i].getSale()) {
				max[0] = fruits[i];
			}
			if (min[0].getSale() > fruits[i].getSale()) {
				min[0] = fruits[i];
			}
		}
		System.out.println("판매량이 가장 많은 과일" + max[0].getKind());
		System.out.println("판매량이 가장 적은 과일" + min[0].getKind());

		// 총 판매액, 평균 판매액
		for (int i = 0; i < fruits.length; i++) {
			totalPrice += (fruits[i].getPrice() * fruits[i].getSale());
			totalSale += fruits[i].getSale();
		}

		System.out.println("총 판매액>" + totalPrice);
		System.out.println("평균 판매액>" + (double) totalPrice / totalSale);
		scanner.close();
	}
}
package Test0507.TestFruitT;

import java.util.Scanner;

//Scanner로 값을 입력받아서 Fruit객체를 생성하여 배열에 저장하고,
//판매수량에 따른 오름차순 정렬
//판매량이 가장 적은 과일과
//판매량이 가장 많은 과일을 출력
//총수판매액과 평균판매액을 출력
public class FruitMainExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Fruit[] fruits = new Fruit[4];

		for (int i = 0; i < fruits.length; i++) {
			System.out.println("과일명을 입력하세요> ");
			String kind = scanner.next();
			System.out.println("가격을 입력하세요> ");
			int price = scanner.nextInt();
			System.out.println("당도(LOW, MEDIUM, HIGH)를 입력하세요> ");
			String brix = scanner.next();

			Fruit fruit = new Fruit(kind, price, Brix.valueOf(brix));
			fruits[i] = fruit;
		}

		// Fruit f = fruits[0]; f.setSale(20);
		// System.out.println("과일별 판매 수량 입력");
		// System.out.println("수량을 입력하세요> ");
		// int sale = scanner.nextInt();
		// fruits[0].setSale(sale);
		// System.out.println("수량을 입력하세요> ");
		// sale = scanner.nextInt();
		// fruits[1].setSale(sale);
		// System.out.println("수량을 입력하세요> ");
		// sale = scanner.nextInt();
		// fruits[2].setSale(sale);
		// System.out.println("수량을 입력하세요> ");
		// sale = scanner.nextInt();
		// fruits[3].setSale(sale);
		System.out.println("과일별 판매 수량 입력");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i].getKind() + "의 수량을 입력하세요> ");
			int sale = scanner.nextInt();
			fruits[i].setSale(sale);
		}
		System.out.println("정보 출력");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i].toString());
		}

		double tot = 0;
		// 오름차순 정렬
		for (int i = 0; i < fruits.length; i++) {
			for (int j = i + 1; j < fruits.length; j++) {
				if (fruits[i].getSale() > fruits[j].getSale()) {
					Fruit f = fruits[i];
					fruits[i] = fruits[j];
					fruits[j] = f;
				}
			}
		}

		// 총합
		for (int i = 0; i < fruits.length; i++) {
			tot += fruits[i].getPrice() * fruits[i].getSale();
		}

		System.out.println("정렬 후 정보 출력");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i].toString());
		}

		System.out.println("최소 판매량 과일 정보: " + fruits[0]);
		System.out.println("최대 판매량 과일 정보: " + fruits[fruits.length - 1]);
		System.out.println("총 판매액: " + tot);
		System.out.println("평균 판매액:" + tot / fruits.length);
		scanner.close();
	}
}
package Test0507.Fruit;

//Scanner로 값을 입력받아서 Fruit객체를 생성하여 배열에 저장하고,
//판매수량에 따른 오름차순 정렬
//판매량이 가장 적은 과일과
//판매량이 가장 많은 과일을 출력
//총수판매액과 평균판매액을 출력
public class FruitMainExample2 {
	public static void main(String[] args) {
		Fruit apple = new Fruit("apple", 2000, Brix.LOW);
		Fruit banana = new Fruit("banana", 5000, Brix.valueOf("MEDIUM"));
		Fruit mango = new Fruit("mango", 10000, Brix.valueOf("HIGH"));
		Fruit grape = new Fruit("grape", 7000, Brix.valueOf("HIGH"));

		System.out.println(grape);
		// 판매수량
		apple.setSale(20);
		banana.setSale(50);
		mango.setSale(35);
		grape.setSale(40);

		Fruit[] fruits = { apple, banana, mango, grape };

		for (int i = 0; i < fruits.length; i++) {
			Fruit fruit = fruits[i];
			System.out.println(fruit.getKind() + ":" + fruit.getSale() + "총 판매량:" + fruit.getPrice() * fruit.getSale());
		}

	}

}

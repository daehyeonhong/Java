package Exercise0507.Fruit;

/*"apple",2000,LOW
"banana",5000,MEDIUM
"mango",10000,HIGH
"grape",7000,HIGH*/
public class FruitMainExample {
	public static void main(String[] args) {
		// 배열로 저장
		Fruit[] fruits = { new Fruit("apple", 2000, Brix.LOW), new Fruit("banana", 5000, Brix.MIDIUM),
				new Fruit("mango", 10000, Brix.HIGH), new Fruit("grape", 7000, Brix.HIGH) };

		for (Fruit fruit : fruits) {
			System.out.println(fruit.toString());
		}
		for (Fruit fruit : fruits) {
			System.out.println(fruit);
		}

		for (int i = 0; i < fruits.length; i++) {
			Fruit f = fruits[i];
			System.out.println(f);//toString이 자동 호출 됨.
		}
	}
}
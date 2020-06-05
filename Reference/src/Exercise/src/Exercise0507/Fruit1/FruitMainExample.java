package Exercise0507.Fruit1;

/*"apple",2000,LOW
"banana",5000,MEDIUM
"mango",10000,HIGH
"grape",7000,HIGH*/
public class FruitMainExample {
	public static void main(String[] args) {
		// 배열로 저장
		Fruit apple = new Fruit();
		apple.setKind("apple");
		apple.setPrice(2000);
		apple.setBrix(Brix.valueOf("LOW"));
		Fruit[] fruits = { 
				new Fruit("apple", 2000, Brix.LOW), 
				new Fruit("banana", 5000, Brix.MIDIUM),
				new Fruit("mango", 10000, Brix.HIGH), 
				new Fruit("grape", 7000, Brix.HIGH) };

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i].toString());
		}
	}
}
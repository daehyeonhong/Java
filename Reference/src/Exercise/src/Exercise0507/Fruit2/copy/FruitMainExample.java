package Exercise.src.Exercise0507.Fruit2.copy;

public class FruitMainExample {
	public static void main(String[] args) {
		Fruit apple = new Fruit("apple",2000,Brix.LOW);
		System.out.println(apple.getKind());
		System.out.println(apple.getPrise());
		System.out.println(apple.getBrix());
		apple.getSale(20);
		System.out.println(apple.getSale());
	}
}

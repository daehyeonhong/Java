package Exercise0612.Exercise011;

public class Ex11MainExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;

		System.out.println(obj1 == obj2);// -128~127 범위 안
		System.out.println(obj3 == obj4);// -128~127 범위 밖
		System.out.println(obj3.equals(obj4));
	}
}
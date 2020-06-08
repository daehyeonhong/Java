package Exercise0511.Exercise018T;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
		System.out.println((obj1 == obj2 ? "같은" : "다른") + " ShopService 객체 입니다.");
	}
}
package Exercise.DATE0526.testA;

public class A_aMainExample {
	public static void main(String[] args) {
		A_a a1 = A_a.getInstance();
		A_a a2 = A_a.getInstance();
		if (a1 == a2) {
			System.out.println("싱글톤!");
		} else {
			System.out.println("실패!");
		}
		System.out.println(a1.getMessage());
		System.out.println(a2.getMessage());
		a1.setMessage("싱글톤 변경");
		System.out.println(a2.getMessage());
		a2.setMessage("재변경");
		System.out.println(a1.getMessage());
	}
}
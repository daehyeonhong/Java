package Exercise0427.Exercise03;
//3. 1~100까지의 정수 중 3의 배수의 합
public class Exercise03T {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0)
				sum = sum + i;
		}
		System.out.println("3의 배수의 총 합: " + sum);
	}
}
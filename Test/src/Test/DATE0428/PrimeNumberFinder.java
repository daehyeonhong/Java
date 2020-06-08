package Test.DATE0428;

/*3. 2와 100사이의 모든 소수(prime number)를 찾는 프로그램을 작성하시오.
주어진 수 k를 2부터 k-1까지의 숫자로 나누어서 
 나머지가 0인 것이 하나라도 있으면 소수가 아니다.*/
public class PrimeNumberFinder {
	public static void main(String[] args) {
		int countRemain;
		
		System.out.println("0부터 100 사이의 소수:");
		for (int k = 2; k <= 100; k++) {
			countRemain = 0;
			for (int i = k - 1; i >= 2; i--) {
				if (k % i == 0) {
					countRemain++;
				}
			}
			if (countRemain == 0) {
				System.out.print(k+" ");
			}
		}
	}
}
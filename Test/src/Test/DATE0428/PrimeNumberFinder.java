package Test.DATE0428;

/*3. 2�� 100������ ��� �Ҽ�(prime number)�� ã�� ���α׷��� �ۼ��Ͻÿ�.
�־��� �� k�� 2���� k-1������ ���ڷ� ����� 
 �������� 0�� ���� �ϳ��� ������ �Ҽ��� �ƴϴ�.*/
public class PrimeNumberFinder {
	public static void main(String[] args) {
		int countRemain;
		
		System.out.println("0���� 100 ������ �Ҽ�:");
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
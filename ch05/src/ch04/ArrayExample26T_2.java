package ch04;

/*intŸ���� �� 5���� �����ϴ� �迭�� �����
10 20 30 40 50�� ���� ��
����� ������ ����ϴ� �ڵ带 �ۼ��Ͻÿ�.*/
public class ArrayExample26T_2 {
	public static void main(String[] args) {
		int[] intArr = new int[5];
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;

		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);

		System.out.println("------------");

		int i = 0;
		System.out.println(intArr[i++]);
		System.out.println(intArr[i++]);
		System.out.println(intArr[i++]);
		System.out.println(intArr[i++]);
		System.out.println(intArr[i++]);

		System.out.println("------------");

		for (i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		/*
		 * for (i = 0; i < intArr.length; i++) { System.out.println(intArr[i]); }
		 */
	}
}
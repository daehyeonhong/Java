package ch04;

public class ForExample {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30 };// ���̰� 3�� int Ÿ�� �迭
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		arr1[1] = 50;
		System.out.println(arr1[1]);

		arr1[1] = arr1[0] - arr1[2];
		System.out.println(arr1[1]);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		Integer num2 = new Integer(50);
		//�迭 Integer�� ���� -�迭 ��� ����� intŸ������ ����
		Integer[] arr2 = {10,num2,20};
		System.out.println(arr2[1]);
		
		num2 = new Integer(60);
		System.out.println(arr2[1]);
		String str1 = "Hi";
		
		String[] str = {"ar","bb",str1};
		System.out.println(str[2]);
		
		str1 = "hi2";
		System.out.println(str[2]);
	}
}
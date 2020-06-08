package ch04;

public class ForExample {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30 };// 길이가 3인 int 타입 배열
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
		//배열 Integer로 생성 -배열 요소 저장시 int타입으로 저장
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
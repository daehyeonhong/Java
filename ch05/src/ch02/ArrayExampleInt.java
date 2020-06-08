package ch02;

public class ArrayExampleInt {
	public static void main(String[] args) {
		// 생성된 배열은 각 요소(속성)들이 비어있음, int타입의 기본 값0
		int[] intArray = new int[5];
		for (int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);
		// 배열의 각 요소에 접근은 index번호로 접근
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		// 배열의 각 요소 값 출력
		for (int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);

		// int타입의 기본 값이 저장된 요소 접근
		int result = intArray[3] + 5;
		System.out.println(""+result);
	}
}
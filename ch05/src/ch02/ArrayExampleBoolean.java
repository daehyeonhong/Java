package ch02;

public class ArrayExampleBoolean {
	public static void main(String[] args) {
		// 생성된 배열은 각 요소(속성)들이 비어있음, boolean타입의 기본 값false
		boolean[] booleanArray = new boolean[5];
		for (int i = 0; i < booleanArray.length; i++)
			System.out.println(booleanArray[i]);
		// 배열의 각 요소에 접근은 index번호로 접근
		booleanArray[0] = false;
		booleanArray[1] = true;
		boolean booleanVar = 10>1;
		booleanArray[2] = 10>1;
		// 배열의 각 요소 값 출력
		for (int i = 0; i < booleanArray.length; i++)
			System.out.println(booleanArray[i]);
		System.out.println(booleanVar);

		Boolean result = booleanArray[3];
		System.out.println(""+result);
	}
}
package ch01;

public class NullPointExceptionExample {
	public static void main(String[] args) {
		// 타입[] 변수;
		int[] intArray = null;
		// intArray[0] = 10;
		// 배열 생성
		// 배열 참조 변수 = new 타입[배열 길이];
		intArray = new int[5];
		// 배열의 각 인덱스 위치에 값 저장
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;
		// 배열의 특정 index 위치의 값 출력
		System.out.println(intArray[2]);
		// 생성된 배열의 길이 length는 생성시 초기화되고 바꿀 수 없음.
		System.out.println(intArray.length);
		// intArray.length=10;
	}
}
package ch02;

public class ArrayExampleString {
	public static void main(String[] args) {

		// 생성된 배열은 각 요소(속성)들이 비어있음, String타입의 기본 값false
		String[] stringArray = new String[5];
		for (int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);

		// 배열의 각 요소에 접근은 index번호로 접근
		stringArray[0] = "hello";
		stringArray[1] = "hi";
		stringArray[2] = new String("hello");

		// 배열의 각 요소 값 출력
		for (int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);

		// 참조 변수가 대입되는 index 번호에 null값을 주면 객체의 참조가 끊어짐
		stringArray[0] = null;
		for (int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);

		String result = stringArray[3] + "홍길동";
		System.out.println("result:" + result);

		// 오류 발생

		// 참조 타입이 저장된 요소의 값이 null이므로 참조 객체가 없음.
		// System.out.println("length:"+stringArray[3].length());

		// 참조 타입이 저장된 요소의 값이 null이므로 참조 객체가 없음.-비교 불가
		// System.out.println("result:" + stringArray[3].equals("홍길동"));
	}
}
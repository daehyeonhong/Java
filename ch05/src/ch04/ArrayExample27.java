package ch04;

/*String타입의 데이타를 저장할 수 있는 길이가 5인 배열을 만들고
배열의 index번호가 짝수번째인 요소에 값을 "hello", "hi", "hey"를
입력하고내욜을 출력하세요*/
public class ArrayExample27 {
	public static void main(String[] args) {
		String[] strArray = new String[5];
		strArray[0] = "hello";
		strArray[2] = "hi";
		strArray[4] = "hey";

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
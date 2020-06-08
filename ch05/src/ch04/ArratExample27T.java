package ch04;

/*String타입의 데이타를 저장할 수 있는 길이가 5인 배열을 만들고
배열의 index번호가 짝수번째인 요소에 값을 "hello", "hi", "hey"를
입력하고내욜을 출력하세요*/
public class ArratExample27T {
	public static void main(String[] args) {
		/*
		 * String[] strArr = new String[5]; System.out.println(strArr[0]);
		 * 
		 * strArr[0] = "hello";// 리터럴로 string객체 생성 strArr[2] = new String("hi");// new
		 * String{}으로 객체 생성 String str = "hey"; strArr[4] = str;
		 */

		String[] strArr = { "hello", "", "hi", "", "hey" };

		int i = 0;
		System.out.println(strArr[i]);
		System.out.println(strArr[i += 2]);
		System.out.println(strArr[i += 2]);
		
		System.out.println("----------------------");
		
		for (int j = 0; j < strArr.length; j += 2) {
			System.out.println(strArr[j]);
		}
	}
}

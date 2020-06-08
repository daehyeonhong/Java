package ch05;

/*int타입의 데이터를 저장하는 길이가 3인 배열을 만들고
index번호 0에는 10, 마지막 index번호에는  20을 저장하고
index번호0에 저장된 값과 마지막 index번호에 저장된 값을 더한 값을
index번호 1에 저장하고, 전체 배열내용을 출력하세요.*/
public class ArrayExample28T {
	public static void main(String[] args) {
		int[] intArr = new int[3];
		intArr[0] = 10;
		intArr[2] = 20;
		intArr[1] = intArr[0] + intArr[2];

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
}
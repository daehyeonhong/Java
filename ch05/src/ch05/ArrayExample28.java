package ch05;

/*int타입의 데이터를 저장하는 길이가 3인 배열을 만들고
index번호 0에는 10, 마지막 index번호에는  20을 저장하고
index번호0에 저장된 값과 마지막 index번호에 저장된 값을 더한 값을
index번호 1에 저장하고, 전체 배열내용을 출력하세요.*/
public class ArrayExample28 {
	public static void main(String[] args) {
		int[] intArray = new int[3];
		intArray[0] = 10;
		intArray[intArray.length - 1] = 20;
		intArray[1] = intArray[0] + intArray[intArray.length - 1];

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}
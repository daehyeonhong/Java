package ch04;

/*int타입의 값 5개를 저장하는 배열을 만들고
10 20 30 40 50을 저장 후
저장된 내용을 출력하는 코드를 작성하시오.*/
public class ArrayExample26 {
	public static void main(String[] args) {
		int[] intArray = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
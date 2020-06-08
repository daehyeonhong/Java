package ch04;

/*int타입의 값 5개를 저장하는 배열을 만들고
10 20 30 40 50을 저장 후
저장된 내용을 출력하는 코드를 작성하시오.*/
public class ArrayExample26T_2 {
	public static void main(String[] args) {
		int[] intArr = new int[5];
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;

		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);

		System.out.println("------------");

		int i = 0;
		System.out.println(intArr[i++]);
		System.out.println(intArr[i++]);
		System.out.println(intArr[i++]);
		System.out.println(intArr[i++]);
		System.out.println(intArr[i++]);

		System.out.println("------------");

		for (i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		/*
		 * for (i = 0; i < intArr.length; i++) { System.out.println(intArr[i]); }
		 */
	}
}
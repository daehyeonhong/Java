package ch04;

//얕은 복사(swallow copy)
public class ArrayCopyExample31 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };

		// arr1이 참조하는 배열객체의 번지를 넘김
		int[] arr2 = arr1;// 같은 객체를 가리킴
		// 배열값 변경 전
		System.out.print("arr1의 값: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.print("arr2의 값: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		arr2[2] = 99;
		// 배열값 변경 후
		System.out.print("arr1의 값: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.print("arr2의 값: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
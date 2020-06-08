package ch03;

public class ArrayExample1 {
	public static void main(String[] args) {
		//생성시길이는 정해졌지만 각 요소값은 정해져있지않다.
		int[] intArray = new int[5];
		//생성시 길이와 각 요소 값들이 정해짐
		int[] intArray2 = { 1, 2, 3, 6, 7 };
		
		System.out.println(intArray.length);
		System.out.println(intArray2.length);
	}
}

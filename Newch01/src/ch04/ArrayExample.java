package ch04;

public class ArrayExample {
	public static void main(String[] args) {

		// 초기값 목록으로 이차원 배열 만들기
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };

		// 변수 선언 후 값 초기화
		int[][] arr2;
		arr2 = new int[][] { { 2, 4, 6 }, { 7, 8, 9 } };

		// 배열 객체 생성 후 각 요소에 값 저장
		int[][] arr3 = new int[2][3];
		arr3[0][0] = 1;
		arr3[0][1] = 2;
		arr3[0][2] = 3;
		arr3[1][0] = 4;
		arr3[1][1] = 5;
		arr3[1][2] = 6;

		// 값 출력
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i][0] + "\t");
			System.out.print(arr3[i][1] + "\t");
			System.out.println(arr3[i][2] + "\t");
		}

		int max = 0, min = 100, sum = 0;
		double avg = 0.0;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "\t");
				if (max < arr3[i][j]) {
					max = arr3[i][j];
				}
				if (min > arr3[i][j]) {
					min = arr3[i][j];
				}
				sum += arr3[i][j];
			}
			System.out.println();
		}

		avg = (double) sum / arr3.length * arr3[0].length;

		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		for (int[] is : arr1) {
			for (int is2 : is) {
				System.out.print(is2+"\t");
			}
		}System.out.println();
		for (int[] is : arr2) {
			for (int is2 : is) {
				System.out.print(is2+"\t");
			}
		}
	}
}
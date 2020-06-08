package ch02;

public class NestedWhileExample4 {
	public static void main(String[] args) {
		int i = 1;//시작값 초기화
		while (i <= 9) {//빠져나가는 조건 비교문
			int j = 2;//시작값 초기화
			while (j <= 9) {//빠져나가는 조건 비교문
				System.out.print(j + "X" + i + "=" + (i * j) + "\t");// 한 줄로 쓰기
				j++;//증감식
			}
			System.out.println();//한 줄 아래로 내리기
			i++;//증감식
		}
	}
}
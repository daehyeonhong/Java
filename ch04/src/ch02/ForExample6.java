package ch02;
//for문을 이용하여 1부터 10까지 덧셈을 표시하고 합을 구하는 문제
public class ForExample6 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 10; i >= 0; i--) {
			sum=i;//sum = sum+1;
			System.out.print(i);

			if (i>1) System.out.print("+");//한 줄로 이어서 출력 print();
			else {
				System.out.print("=");
				System.out.print(sum);//출력 후 다음 줄로 이동 println();
			}
		}//for문 끝.
	}
}
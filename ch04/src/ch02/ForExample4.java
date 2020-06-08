package ch02;
//for(초기값; 비교조건; 증감){실행문;}
public class ForExample4 {
	public static void main(String[] args) {
		int sum = 0;

		int i = 1;
		for (;;) {
			if (i>100) break;
			sum = sum + i;
			i++;
			System.out.println("1부터"+i+" 100까지 정수의 합:"+sum);
		}
	}
}

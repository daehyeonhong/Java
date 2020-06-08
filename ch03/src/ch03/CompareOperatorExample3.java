package ch03;
//논리연산 |와 ||: ||는 왼쪽이 참이면 오른쪽 상관없이 참
//논리연산 &와 &&: &&는 왼쪽이 거짓이면 오른쪽 상관없이 거짓
public class CompareOperatorExample3 {
	public static void main(String[] args) {
		int x=1,y=-1;
		
		//왼쪽이 false이면 왼쪽만 처리
		if (((x++)==2) && (x/(++y)==1)) {//false && ?
			System.out.println("result1");
		} else {
			System.out.println("error1");
		}
		
		//왼쪽이 true이면 왼쪽만 처리
		if (x==2 | (x+y)==2) {//true || ?
			System.out.println("result2");
		} else {
			System.out.println("Error2");
		}
	}
}
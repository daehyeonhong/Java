package ch03;
//대입 연산:오른편 연산의 결과나 값을 왼편 변수에 저장하는 연산
public class AssignmentDecOperator {
	public static void main(String[] args) {
		
		int a = 3, b = 3, c = 3;
		//대입연산자
		a+=3;//a=a+3
		System.out.println(a);
		b*=3;//b=b*3;
		System.out.println(b);
		c%=2;//c=c%2
		System.out.println(c);
		
		int d = 3;
		a=d++;//a=d,d+1
		System.out.print(a);
		System.out.println(d);
		a=++d;
		System.out.print(a);
		System.out.println(d);
		a=d--;
		System.out.print(a);
		System.out.println(d);
		a=--d;
		System.out.print(a);
		System.out.println(d);
		
		//반복문
		//for반복문 for(초기값;종료값;증/감){명령문}
		for (int i = 1; i <= 5; i++) {
			if (i<=4) {
				System.out.print(i+",");
			} else {
				System.out.println(i+"!");
			}
		}
		//1부터 2씩 증가한 값 출력
		System.out.println("=============================");
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		//10부터 2씩 감소한 값 출력
		System.out.println("=============================");
		for (int i = 10; i >=0; i-=2) {
			System.out.println(i);
		}
	}
}

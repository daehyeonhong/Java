package ch02;
//continue문: 반복문에서 continue문을 만나면 해당 회차는 continue아래 명령문들은 skip하고 다음 회차로 바로 넘어감.
public class ContinueExample {
	//짝수만 출력하는 프로그램
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i%2!=0) 
				continue;
			System.out.println(i);

		}
	}
}

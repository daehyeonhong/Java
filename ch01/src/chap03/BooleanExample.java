package chap03;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		if(stop==true) {//if(조건) <= 조건이 참이면 {}을 실행하라.
			System.out.println("중지합니다.");
		}else {//if(조건) <== 조건이 거짓이면 {}을 실행하라.
			System.out.println("시작합니다.");
		}
	}
}

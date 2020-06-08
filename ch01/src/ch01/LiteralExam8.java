package ch01;
//리터럴 - 논리 리터럴(true / false)
public class LiteralExam8 {

	public static void main(String[] args) {
		//메소드 내에서 선언된 변수(지역변수=로컬변수)는 반드시 초기화 해야 읽을 수 있음.
		boolean isRun = false;//변수 초기값으로 true/false 입력
		
		if(isRun==true) {//조건문
			System.out.println("실행");
		}else {
			System.out.println("정지");
		}
		int i = 1;
		while(isRun==true) {
			System.out.println("i의 값="+i);
			i = i + 1;
		}
		System.out.println("종료");
	}
}

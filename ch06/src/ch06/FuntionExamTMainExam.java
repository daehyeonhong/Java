package ch06;

public class FuntionExamTMainExam {
	public static void main(String[] args) {
		FuntionExamT fe = new FuntionExamT();

		// 매개 변수 받고 리턴 타입 있는 메소드 호출
		double result = fe.method1(10, 20);
		System.out.println(result);
		
		// 매개 변수 받고 리턴 타입 없는 메소드 호출
		fe.method2(10, 20);

		
		fe.x = 20;
		fe.y = 30;
		// 매개 변수 받지 않고 리턴 타입 있는 메소드 호출
		result = fe.method3();
		System.out.println(result);

		// 매개 변수 받지 않고 리턴 타입 없는 메소드 호출
		fe.method4();
	}
}

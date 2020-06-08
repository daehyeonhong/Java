package ch01;

public class VariableTest1 {
	public static void main(String[] args) {
		/*int value;
		int result = value + 10;
		System.out.println(result);*/
		
		int score;//선언문
		score=90;//대입문
		System.out.println("score="+score);//System클래스의 out변수내의 println()문 호출;
		
		int score2=180;//선언과 동시에 대입
		System.out.println("score2="+score2);
		
		int value1 = 30;
		int result1 = value1 + 10;
		System.out.println(result1);
	}//main {~}메소드 블럭
}//VariableTest1 {~}클래스 블럭

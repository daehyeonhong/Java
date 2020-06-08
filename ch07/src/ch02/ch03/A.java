package ch02.ch03;

public class A {
	A(){
		System.out.println("A의 default 생성자 호출");
	}
	
	A(int x){
		System.out.println("A의 x가 있는 생성자 호출");
	}
	
	A(double x){
		System.out.println("A의 x.x가 있는 생성자 호출");
	}
}

class B extends A{
	B(){
		super(10.0);//super()메소드는 매개 변수 타입에 따른 부모 생성자를 호출
		System.out.println("B생성자 호출");
	}
}
package ch13.ch02.package2;

//접근 제한자가 public이면
//동일 패키지/ 다른 패키지의 클래스에서 접근 가능
import ch13.ch02.package1.B;

public class C {
	ch13.ch02.package1.A a = new ch13.ch02.package1.A();
	B b = new B();
}
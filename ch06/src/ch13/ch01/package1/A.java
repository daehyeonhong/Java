package ch13.ch01.package1;

//동일한 패키지에서 서로 접근 가능
//default접근제한자
class A {
	B b = new B();
}

class B {
	A a = new A();
}
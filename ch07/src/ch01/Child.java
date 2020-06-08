package ch01;

//자바의 클래스는 다중 상속을 허용하지 않음
//class child extends Parent{}
public class Child extends Parent1/* ,Parent2 */ {

}

class Child2 extends Parent1 {

}

class child3 extends Parent2 {

}

class GrandChild extends Child {

}
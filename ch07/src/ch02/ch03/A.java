package ch02.ch03;

public class A {
	A(){
		System.out.println("A�� default ������ ȣ��");
	}
	
	A(int x){
		System.out.println("A�� x�� �ִ� ������ ȣ��");
	}
	
	A(double x){
		System.out.println("A�� x.x�� �ִ� ������ ȣ��");
	}
}

class B extends A{
	B(){
		super(10.0);//super()�޼ҵ�� �Ű� ���� Ÿ�Կ� ���� �θ� �����ڸ� ȣ��
		System.out.println("B������ ȣ��");
	}
}
package Exercise0513.Exercise006;

public class Parent {
	public String nation;

	public Parent() {
		this("���ѹα�");// �ڱ� Ŭ������ �ٸ� �Ű� ���� ������ ȣ��
		System.out.println("Parent() call");//2
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");//1
	}
}

class Child extends Parent {
	private String name;

	Child() {
		this("ȫ�浿");
		System.out.println("Child() call");//4
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name)//3call");//3
	}
}
package ch06.ch02;

//�߻� Ŭ����
public abstract class Animal {
	int a;
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	// �߻� �޼ҵ� - ��� ���� Ŭ�������� �ݵ�� ������ �ؾ��ϴ� �޼ҵ�
	abstract void fly();// {System.our.println(";;;;;;")}�� ����
	//�Ϲ� �޼ҵ� - ��� ���� �ڽ� Ŭ�������� ��� ���� �״�� ����ϴ� ���
	void stop() {
		System.out.println("����");
	}
}

class Bird extends Animal {
	@Override
	void fly() {
		System.out.println("����");
	}
}

class Insect extends Animal {
	@Override
	void fly() {
		System.out.println("��¦ �ٴ�");
	}
}

class Fish extends Animal {
	@Override
	void fly() {
		System.out.println("���ġ��");
	}
}
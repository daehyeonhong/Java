package ch01;

//���� ������ class Ŭ������{}
//�Ӽ� + �޼ҵ� + �����ڸ� ��� �ϳ��� Ŭ������ ����
public class FishBread {
	static int seq = 0;
	//�Ӽ�
	String name;

	int no;
	//������-������ ��ü�� �ʱ�ȭ ����(�������� �̸��� 'Ŭ������ + ()'�� ����)
	//���������� Ŭ������() {���๮;}
	public FishBread() {
		no = ++seq;
		System.out.println(no+"��° �ؾ ź��");
	}
	//�޼ҵ�
	//���� ������ ����Ÿ�� �޼ҵ��() {���๮;}
	public void method1() {
		System.out.println(name);
	}
}
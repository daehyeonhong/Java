package ch01; //��Ű���� �ҽ� ���� ��ġ ����

public class Calculator {//Ŭ���� �����
	//�ڹٴ� Ÿ���� ������.
	public static void main(String[] args) {//main �޼ҵ� �����
		//Ư�� Ŭ���� ���� ���Ե� �Լ� = �޼ҵ�
		int x=2;//������ ���� x�� �����ϰ� �������ͷ� 2�� ����
		int y=3;//������ ���� y�� �����ϰ� �������ͷ� 3�� ����
		int result = x+y;//���������� x�� ����� ���� ���������� y�� ����� ���� ���� ����� ���������� result�� ����
		//dot notation
		final int z=5;//������ ��� z�� �����ϰ� �ʱⰪ ���� 5�� ����
		System.out.println("���: " + result);//"���:"���ڿ��� result�� ����� ���� ������ ��� ���
				//int x�� int y�� ���ͷ������� int result�� ���ͷ��� �ƴϴ�
		System.out.println("1+2"+"3");
		//z=10; //������ ������� �ʱ�ȭ ���� ���� ���� �Ұ�;
		System.out.println("z="+z);
		
		x=10; y=20;
		result=x+y;
		System.out.println("x+y="+result);
	}
}

//���� �տ� final�� ���̸� ����� ��ȭ 

/*ch01;
Calculator
main(args) {
x=2;
y=3;
result = x+y;
		System.out.println("���: " + result);
		System.out.println("1+2"+"3");
	}
}*/
//�ĺ��� 13�� (ch01, Calculator, main, args, x, y, result, System, out, println, System, out, println)
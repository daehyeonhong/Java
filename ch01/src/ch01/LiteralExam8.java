package ch01;
//���ͷ� - �� ���ͷ�(true / false)
public class LiteralExam8 {

	public static void main(String[] args) {
		//�޼ҵ� ������ ����� ����(��������=���ú���)�� �ݵ�� �ʱ�ȭ �ؾ� ���� �� ����.
		boolean isRun = false;//���� �ʱⰪ���� true/false �Է�
		
		if(isRun==true) {//���ǹ�
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		int i = 1;
		while(isRun==true) {
			System.out.println("i�� ��="+i);
			i = i + 1;
		}
		System.out.println("����");
	}
}

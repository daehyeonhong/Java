package ch01;

public class IfExample1 {
	public static void main(String[] args) {
		int num = 3;
		
		//������ ������ �ϳ��� ������ ����
		if (num%2==0) {
			System.out.println(num+"�� ¦���Դϴ�.");
			System.out.println(num);
		}
		
		//�ٸ� ��ɹ����� �ν�
		if (num%2==0)
			System.out.println(num+"�� ¦���Դϴ�.");
		System.out.println(num);
		
		//
		if (num%2==0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		
		if (num%2==0) {
			System.out.println("¦��");
		} else {
			System.out.println(num);
			System.out.println("Ȧ��");
		}
	}
}

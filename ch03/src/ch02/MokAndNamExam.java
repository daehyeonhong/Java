package ch02;

public class MokAndNamExam {
	public static void main(String[] args) {
		int num = 69;
		int mok, nam;
		
		//��
		mok = num/10;

		//������
		nam = num%10;
		
		System.out.println(num+"�� 10���� ���� ��:"+mok);
		System.out.println(num+"�� 10���� ���� ������"+nam);
		
		System.out.println("�Ǽ�����:"+(num/10.0));
	}
}

package ch02;
//��Ȯ�� ���� �ε��Ҽ��� Ÿ�� �����������
public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;//1-0.7 = 0.3
		
		System.out.println("��� �Ѱ����� 0.7 ������ ����, ");
		System.out.println(result+"������ ���´�");
	}
}

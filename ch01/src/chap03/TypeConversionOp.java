package chap03;

public class TypeConversionOp {
	public static void main(String[] args) {
		int intValue = 10;
		double doubleValue = 5.5;
		
		System.out.println(intValue + doubleValue);//�Ǽ� + �Ǽ�
		System.out.println(intValue + (int)doubleValue);//���� + ����, ��������ȯ(casting)
	}
}

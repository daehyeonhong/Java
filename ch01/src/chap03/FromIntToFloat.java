package chap03;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		System.out.println(num1-num2);
		
		float num3 = num2;//int -> float: ��ȣ(1��Ʈ) + ����(8��Ʈ) + ����(23��Ʈ)
		num2 = (int)num3;//��������ȯ(casting)
		
		int result = num1 - num2;
		System.out.println(result);
		
		num2 = 123456780;
		double num4 = num2;//double: �μ�(1��Ʈ) + ���� (11��Ʈ) + ����(52��Ʈ)
		num2 = (int) num4;
		
		result = num1 - num2;
		System.out.println(result);
		
		int a = 24;
		float b = a;
		System.out.println((a)+(b));
	}
}

package ch01;
//���� ������ :��ȣ(+,-)
public class SignOperationExample {

	public static void main(String[] args) {
		int x= -100;//���ͷ� �տ� ��ȣ(-)
		int result1 = +x;//���� �տ� ��ȣ(+)
		int result2 = -x;//���� �տ� ��ȣ(-):-(-100) => +100
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);

		short s = 100;
		//short result3 = -s;//-byte =>int Ÿ������ ��ȯ �Ǿ ���� �Ұ�
		int result = -s;
		System.out.println("result=" + result);
		
	}

}

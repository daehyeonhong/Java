package ch02;

public class TryCatchExam3 {
	public static void main(String[] args) {
		System.out.println("hello");
		try {
			returnExcept();//�Լ� ȣ��(����) - �Լ����� ���;
		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("hi");
	}
	//�޼ҵ�
	//���������� ������ġ ����Ÿ�� �޼ҵ��() throws ��������{��ɹ�;}
	public static void returnExcept() throws Exception {
		throw new Exception("���� �����߻�");
	}
}

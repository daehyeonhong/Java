package ch04;

/*StringŸ���� ����Ÿ�� ������ �� �ִ� ���̰� 5�� �迭�� �����
�迭�� index��ȣ�� ¦����°�� ��ҿ� ���� "hello", "hi", "hey"��
�Է��ϰ����� ����ϼ���*/
public class ArrayExample27 {
	public static void main(String[] args) {
		String[] strArray = new String[5];
		strArray[0] = "hello";
		strArray[2] = "hi";
		strArray[4] = "hey";

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
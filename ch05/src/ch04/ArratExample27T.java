package ch04;

/*StringŸ���� ����Ÿ�� ������ �� �ִ� ���̰� 5�� �迭�� �����
�迭�� index��ȣ�� ¦����°�� ��ҿ� ���� "hello", "hi", "hey"��
�Է��ϰ����� ����ϼ���*/
public class ArratExample27T {
	public static void main(String[] args) {
		/*
		 * String[] strArr = new String[5]; System.out.println(strArr[0]);
		 * 
		 * strArr[0] = "hello";// ���ͷ��� string��ü ���� strArr[2] = new String("hi");// new
		 * String{}���� ��ü ���� String str = "hey"; strArr[4] = str;
		 */

		String[] strArr = { "hello", "", "hi", "", "hey" };

		int i = 0;
		System.out.println(strArr[i]);
		System.out.println(strArr[i += 2]);
		System.out.println(strArr[i += 2]);
		
		System.out.println("----------------------");
		
		for (int j = 0; j < strArr.length; j += 2) {
			System.out.println(strArr[j]);
		}
	}
}

package Exercise0427.Exercise05;

//5. ��ø for���� �̿��Ͽ� ������ 4x+5y=60�� ��� �� ����
//��, x�� y�� 10������ �ڿ���
public class Exercise05T {
	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60)
					System.out.println("(x= " + x + ", y= " + y + ")");
			}
		}
	}
}
package ch02;
//continue��: �ݺ������� continue���� ������ �ش� ȸ���� continue�Ʒ� ��ɹ����� skip�ϰ� ���� ȸ���� �ٷ� �Ѿ.
public class ContinueExample {
	//¦���� ����ϴ� ���α׷�
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i%2!=0) 
				continue;
			System.out.println(i);

		}
	}
}

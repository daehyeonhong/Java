package ch03;
//������ |�� ||: ||�� ������ ���̸� ������ ������� ��
//������ &�� &&: &&�� ������ �����̸� ������ ������� ����
public class CompareOperatorExample3 {
	public static void main(String[] args) {
		int x=1,y=-1;
		
		//������ false�̸� ���ʸ� ó��
		if (((x++)==2) && (x/(++y)==1)) {//false && ?
			System.out.println("result1");
		} else {
			System.out.println("error1");
		}
		
		//������ true�̸� ���ʸ� ó��
		if (x==2 | (x+y)==2) {//true || ?
			System.out.println("result2");
		} else {
			System.out.println("Error2");
		}
	}
}
package ch02;

public class VariableScope1 {

	public static void main(String[] args) {
		int var1;//main �޼ҵ� ������ ����� ���� ����
		
		if(true) {
			int var2;
			var1 = 10;//main �޼ҵ� ���� if ������ ��� ����
			var2 = 20;
			System.out.println("var1="+var1);
			System.out.println("var2="+var2);
			//System.out.println("var3="+var3); �ٸ� �� ���� ���� ��� �Ұ�
		}
		
		for(int i = 0; i < 10; i++) {
			int var3;
			var3 = i;//���� ���� var3�� ���� ����i�� ���� ����
			System.out.println("var3="+var3);
			System.out.println("var1="+var1);
			//System.out.println("var2="+var2); �ٸ� �� ���� ���� ��� �Ұ�
			var1 = 20;//main �޼ҵ� ���� for ������ ��� ����
		}
		
		System.out.println("var1="+var1);//main �޼ҵ� ������ ��� ����
		//System.out.println("var2="+var2);//���� ������ ����� ������ ���� ������ ��� �Ұ�
		//System.out.println("var3="+var3);//���� ������ ����� ������ ���� ������ ��� �Ұ�
		
	}
}

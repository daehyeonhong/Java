package chap03;

public class ByteExam3 {
	public static void main(String[] args) {
		byte var1 = 125;//-128~127
		int var2 = 125;//(-2^31)~(2^31)-1
		
		//for(�ʱⰪ; ����; ����)
		for(int i = 0; i<5; i++) {//�ʱⰪ0, ����4, 1�� ����
			var1++;//++�������� 1�� ����
			var2++;//++�������� 1�� ����
			System.out.println("var1:"+var1+"\t"+"var2:"+var2);
		}
	}
}

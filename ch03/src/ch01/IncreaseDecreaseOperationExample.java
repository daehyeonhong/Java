package ch01;
//���� ����:����(++,--)
public class IncreaseDecreaseOperationExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------");
		x++;//��ġ����
		System.out.println("x=" + x);
		++x;//��ġ����
		System.out.println("x=" + x);
		
		System.out.println("------------");
		y--;//��ġ����
		System.out.println("y="+y);
		--y;//��ġ����
		System.out.println("y="+y);
		
		System.out.println("------------");
		z = x++;//���� x�� 12�� z�� ���� �� 1����(13)
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------");
		z = ++x;//���� x�� 1������ 14�� �ٲ� �� z�� ����
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------");
		z = ++x + y++;//z = 15 + 8
		System.out.println("z=" + z);//23
		System.out.println("x=" + x);//15
		System.out.println("y=" + y);//9
	}
}

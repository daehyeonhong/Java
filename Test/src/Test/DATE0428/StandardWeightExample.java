package Test.DATE0428;

import java.util.Scanner;

/*2. ����ڷκ��� Ű�� �Է¹޾Ƽ�  ǥ��ü���� ����� �� �������
   ü�߰� ���Ͽ� ��ü������, ǥ������, ��ü������ ����Ͻÿ�.
  ǥ��ü��=(Ű -100 ) *0.9*/
public class StandardWeightExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double weight, height, standardWeight;
		
		System.out.println("Ű�� �Է��ϼ���.");
		height = scanner.nextDouble();
		
		standardWeight = (double) (height - 100) * 0.9;

		System.out.println("ü���� �Է��ϼ���.");
		weight = scanner.nextDouble();
		
		System.out.println(standardWeight > weight ? "��ü��" : standardWeight < weight ? "��ü��" : "����ü��");
		System.out.println("ǥ��ü��:"+standardWeight);
		
		scanner.close();
	}
}
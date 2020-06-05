package Exercise0507.Fruit;

import java.util.Scanner;

//Scanner�� ���� �Է¹޾Ƽ� Fruit��ü�� �����Ͽ� �迭�� �����ϰ�,
//�Ǹż����� ���� �������� ����
//�Ǹŷ��� ���� ���� ���ϰ�
//�Ǹŷ��� ���� ���� ������ ���
//�Ѽ��Ǹžװ� ����Ǹž��� ���
public class FruitMainExample2 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		String kind = scanner.next();
		int price = scanner.nextInt();
		String brix = scanner.next();
		Fruit apple=new Fruit(kind, price, Brix.LOW);
		Fruit banana=new Fruit("banana",5000,Brix.valueOf("MEDIUM"));
		Fruit mango=new Fruit("mango",10000,Brix.valueOf("HIGH"));
		Fruit grape=new Fruit("grape",7000,Brix.valueOf("HIGH"));

		System.out.println(grape);
		//�Ǹż���
		apple.setSale(20);
		banana.setSale(50);
		mango.setSale(35);
		grape.setSale(40);

		Fruit[] fruits = {
				apple,banana,mango,grape
		};

		for(int i=0;i<fruits.length;i++) {
			Fruit fruit=fruits[i];
			System.out.println(fruit.getKind()+":"+fruit.getSale()
			+":"+fruit.getPrice()*fruit.getSale());
		}	


	}

}

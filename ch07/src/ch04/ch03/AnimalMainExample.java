package ch04.ch03;

public class AnimalMainExample {
	public static void main(String[] args) {
		// �ڽ� Ÿ���� ��ü�� �����ϴ� cat ������
		Cat cat = new Cat();
		// �θ� Ÿ���� ��ü�� �����ϴ� animal ������ ����
		// cat�� �����ϴ� ��ü�� �θ�Ÿ���� Animal�� �ڵ� ����ȯ(promotion)�Ǿ� ����
		Animal animal = cat;

		System.out.println(cat == animal ? "���ϰ�ü" : "�ٸ���ü");

		animal = new Cat();
		System.out.println(cat == animal ? "���ϰ�ü" : "�ٸ���ü");
	}
}
package ch10.ch04;

//Singleton �� ������ ��ü�� �ϳ�. 
public class SingletonMainExample {
	public static void main(String[] args) {
		// Singleton s1 = new Singleton();
		// Singleton s2 = new Singleton();

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
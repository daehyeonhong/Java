package ch04;

public class SwitchExample {
	public static void main(String[] args) {
		int time = 9;
		
		switch (time) {
		case 6:
			System.out.println("���");
		case 7:
			System.out.println("�");
		case 8:
			System.out.println("�Ļ�");
			break;
		case 9:
			System.out.println("���");
		case 10:
			System.out.println("ȸ��");
		default:
			System.out.println("�ٹ�");
		}
	}
}
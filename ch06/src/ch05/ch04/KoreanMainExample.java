package ch05.ch04;

public class KoreanMainExample {
	public static void main(String[] args) {
		// Korean k = new Korean();//default �����ڷδ� ���� �Ұ�
		Korean korean1 = new Korean("ȫ�浿", "104219-1233012");
		Korean korean2 = new Korean("������", "102490-0124921");
		korean1.getInfo();
		korean2.getInfo();
	}
}
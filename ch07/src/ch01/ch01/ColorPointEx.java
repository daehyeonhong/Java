package ch01.ch01;

public class ColorPointEx {
	public static void main(String[] args) {
		// �θ�ü ����
		Point p = new Point();
		p.set(1, 2);// �θ� ��ü�� private ���� ���ѵ� ����� ����
		p.showPoint();// public���� ����� showPoint()�� private �� ����

		// �ڽ� ��ü ����
		ColorPint cp = new ColorPint();
		cp.set(3, 4);// point ��ü(�θ�)�� set() ȣ��
		cp.setColor("red");// �ڽ� ��ü���� �߰��� �޼ҵ� ȣ��
		cp.showColorPoint();// �޼ҵ峻�� showPoint()�� ���� private�� ����� �θ� �ʵ� x,y����
	}
}
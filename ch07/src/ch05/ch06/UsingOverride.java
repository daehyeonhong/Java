package ch05.ch06;

public class UsingOverride {
	public static void main(String[] args) {
		// ��ü�� ������
		Shape start, last, obj;
		// ��ũ�帮��Ʈ�� ���� �����Ͽ� ����
		start = new Line();
		last = start;
		obj = new Rectangle();
		last.next = obj;// Rectangle ��ü ����
		last = obj;
		obj = new Line();// Line ��ü ����
		last.next = obj;
		last = obj;
		obj = new Circle();// Circle ��ü ����
		last.next = obj;
		// ��� ���� ���
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;
		}

		Shape[] s = { new Line(), new Rectangle(), new Line(), new Circle() };
		for (int i = 0; i < s.length; i++) {
			s[i].draw();
		}
	}
}

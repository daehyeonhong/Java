package ch01.ch01;

public class Point {
	// private�� ���� ������ ����� ��� �Ұ�
	private int x, y;

	// public���� ���� ������ ����� ��� ����
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

// ���� ���
class ColorPint extends Point {
	private String color;

	// �ڽ� Ŭ�������� �߰��� ���
	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() {
		System.out.print(color);
		showPoint();// �θ� Ŭ������ public���� ������ ����� method ȣ��
	}
}
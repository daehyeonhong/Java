package ch02.ch07;

public class Point {
	// ��ӿ��� ���ܴ� private �����ڷ� ����� �ʵ�
	private int x, y;// �� ���� �����ϴ� x, y ��ǥ
	// default ������

	public Point() {
		this.x = this.y = 0;
	}

	// �Ű� ���� �ִ� ������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// �޼ҵ�
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);// super() �޼ҵ忡 ���� �θ� Ŭ������ �Ű� ���� ������ ����
		this.color = color;
	}

	public void ShowColorPoint() {
		System.out.println(color);
		showPoint();
	}
}
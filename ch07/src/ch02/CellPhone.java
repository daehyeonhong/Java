package ch02;

public class CellPhone {

	public CellPhone() {
		System.out.println("CellPhone������");
	}
}

class DMBCellPhone extends CellPhone {
	public DMBCellPhone() {
		super();// �θ� Ŭ������ �ٸ� ������ ȣ�� �޼ҵ� super()
		System.out.println("DMBCellPhone������");
	}

	public DMBCellPhone(String s) {
		this();// �ڽ��� Ŭ���� ���� �ٸ� ������ ȣ�� �޼ҵ� this()
		System.out.println("DMBCellPhone������");
	}
}
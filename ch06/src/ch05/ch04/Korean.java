package ch05.ch04;

public class Korean {
	// �ʵ�
	private String name;// null
	private String sNo;// null

	// ������
	public Korean(String name, String sNo) {// ����(�Ű�) ����
		this.name = name;
		this.sNo = sNo;
	}

	// �޼ҵ�
	public void getInfo() {
		System.out.println(this.name + ", " + this.sNo);
	}
}
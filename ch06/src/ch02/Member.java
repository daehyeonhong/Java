package ch02;

public class Member {
	// �ܺ� ���� ���� �Ӽ� -public ���� ������
	public String name;
	public String id;

	// �ܺ� ���� �Ұ� �Ӽ� -private ���� ������
	private String pwd = "1234";

	// this -Ŭ������ ���� ������ instance�� ����Ű�� �����
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// �ܺο� ���� ���� �޼ҵ� -public ���� ������
	public void geInfo(String grant) {
		if (Grant.valueOf(grant) == Grant.ADMIN) {
			System.out.println("��� ��ȣ��: " + getPwd());
		} else {
			System.out.println(Grant.ADMIN.name() + "�� �ƴϸ� Ȯ�� �Ұ�");
		}
	}

	// �ܺο� ���� �Ұ� �޼ҵ� -private ���� ������
	private String getPwd() {
		return this.pwd;
	}
}
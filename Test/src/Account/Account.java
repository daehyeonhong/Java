package Account;

public class Account {
	private String owner;
	private double balance;

	// ������
	Account(String owner, double amount) {
		this.owner = owner;
		balance = amount;
	}

	// �Ա�
	void deposit(int amount) {
		this.balance += amount;
	}

	// ���
	void withDraw(String owner, int amount) { // ��� �� "���¼����ڰ� �ƴϸ� ��� �� �� �����ϴ�."��� // ���� �����ڶ� �ܰ��� ��ݾ��� ������ "�ܰ� ����." ���
		// ����� ��� ó��
		if (!this.owner.equals(owner)) {
			System.out.println("���� �����ڰ� �ƴϸ� ��� �� �� �����ϴ�.");
		} else if (this.balance - amount < 0) {
			System.out.println("�ܰ��� ��ݾ��� ������ �ܰ� ����");
		} else {
			this.balance -= amount;
		}

	}

	// �ܰ�
	void getBalance() {
		System.out.println("�����ܰ�: " + balance);
	}
}
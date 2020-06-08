package Test0513.Bank;

public class Account {
	// �ʵ�
	private String ano;
	private String owner;
	private int balance;

	// ������
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// �޼ҵ�
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (this.balance + balance >= 0) {
			this.balance += balance;
		} else {
			System.out.println("�����߽��ϴ�.");
		}
	}

	public boolean abc(int balance) {
		if (this.balance + balance >= 0) {
			this.balance += balance;
			return true;
		} else {
			return false;
		}
		// if else end

	}// method end

	// toString
	@Override
	public String toString() {
		return ano + "    " + owner + "    " + balance;
	}
}
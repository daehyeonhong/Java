package Test0518.Bank;

public class Account {
	// �ʵ�
	private String ano;
	private String owner;
	private int balance;
	private String password;
	private boolean logon;

	// ������
	public Account(String ano, String owner, int balance, String password) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.password = password;
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
			System.out.println("�����߽��ϴ�. Ȯ�� �� �ٽ� �õ����ּ���.");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLogon() {
		return logon;
	}

	public void setLogon(boolean logon) {
		this.logon = logon;
	}

	// toString
	@Override
	public String toString() {
		if (logon == true) {
			return ano + "    " + owner + "    " + balance + "    " + password + "    " + "�α��λ���";
		} else {
			return ano + "    " + owner + "    " + balance + "    " + password + "    " + "�α׿�������";
		}
	}
}
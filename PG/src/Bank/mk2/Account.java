package Bank.mk2;

public class Account {

	private String ano;
	private String owner;
	private int balance;
	private String password;

	public Account(String ano, String owner, int balance, String password) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.password = password;
	}

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
			System.out.println("금액을 확인하세요.");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// toString
	@Override
	public String toString() {
		return ano + "    " + owner + "    " + balance;
	}
}
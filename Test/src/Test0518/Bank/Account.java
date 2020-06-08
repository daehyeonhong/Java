package Test0518.Bank;

public class Account {
	// 필드
	private String ano;
	private String owner;
	private int balance;
	private String password;
	private boolean logon;

	// 생성자
	public Account(String ano, String owner, int balance, String password) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.password = password;
	}

	// 메소드
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
			System.out.println("실패했습니다. 확인 후 다시 시도해주세요.");
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
			return ano + "    " + owner + "    " + balance + "    " + password + "    " + "로그인상태";
		} else {
			return ano + "    " + owner + "    " + balance + "    " + password + "    " + "로그오프상태";
		}
	}
}
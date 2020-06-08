package Exercise0511.Exercise019T;

public class Account {
	// 필드
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;

	// 생성자
	public Account() {
		// TODO Auto-generated constructor stub
	}

	// 메소드
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE & balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
}
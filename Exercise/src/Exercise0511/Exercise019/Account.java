package Exercise0511.Exercise019;

public class Account {
	private double balance;
	final double MIN_BALANCE = 0;
	final double MAX_BALANCE = 1000000;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (MAX_BALANCE >= balance && MIN_BALANCE <= balance) {
			this.balance = balance;
		}
	}
}
package Account;

public class AccountMainExample {
	public static void main(String[] args) {
		AccountT acc1 = new AccountT("È«±æµ¿", 10000);
		acc1.getBalance();
		// ÀÔ±Ý
		acc1.deposit(2000);
		acc1.getBalance();
		// Ãâ±Ý
		acc1.withDraw("È«±æµ¿", 13000);
		acc1.getBalance();
		acc1.withDraw("ÀÔ²©Á¤", 8000);
		acc1.getBalance();
		acc1.withDraw("È«±æµ¿", 8000);
		acc1.getBalance();
	}
}
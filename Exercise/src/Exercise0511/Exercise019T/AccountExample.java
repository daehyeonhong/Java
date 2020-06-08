package Exercise0511.Exercise019T;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();

		account.setBalance(10000);
		System.out.println("ÇöÀçÀÜ°í: " + account.getBalance());// 10000
		account.setBalance(-100);
		System.out.println("ÇöÀçÀÜ°í: " + account.getBalance());// 10000
		account.setBalance(2000000);
		System.out.println("ÇöÀçÀÜ°í: " + account.getBalance());// 10000
		account.setBalance(300000);
		System.out.println("ÇöÀçÀÜ°í: " + account.getBalance());// 300000
	}
}
package Account;

public class AccountMainExample {
	public static void main(String[] args) {
		AccountT acc1 = new AccountT("ȫ�浿", 10000);
		acc1.getBalance();
		// �Ա�
		acc1.deposit(2000);
		acc1.getBalance();
		// ���
		acc1.withDraw("ȫ�浿", 13000);
		acc1.getBalance();
		acc1.withDraw("�Բ���", 8000);
		acc1.getBalance();
		acc1.withDraw("ȫ�浿", 8000);
		acc1.getBalance();
	}
}
package Account;

public class Account {
	private String owner;
	private double balance;

	// 생성자
	Account(String owner, double amount) {
		this.owner = owner;
		balance = amount;
	}

	// 입금
	void deposit(int amount) {
		this.balance += amount;
	}

	// 출금
	void withDraw(String owner, int amount) { // 출금 시 "계좌소유자가 아니면 출금 할 수 없습니다."출력 // 계좌 소유자라도 잔고보다 출금액이 많으면 "잔고가 부족." 출력
		// 정상시 출금 처리
		if (!this.owner.equals(owner)) {
			System.out.println("계좌 소유자가 아니면 출금 할 수 없습니다.");
		} else if (this.balance - amount < 0) {
			System.out.println("잔고보다 출금액이 많으면 잔고 부족");
		} else {
			this.balance -= amount;
		}

	}

	// 잔고
	void getBalance() {
		System.out.println("현재잔고: " + balance);
	}
}
package Test0514.Bank;

import java.util.Scanner;

public class BankApplication {
	private static final int ANO_NO = 111;
	private static int seq;
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.���� ���� | 2.���� ��� | 3.���� | 4.��� | 5.��ü | 6.Ż�� | 7.��� ��ȣ ���� | 8.����");
			System.out.println("----------------------------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				transfer();
				break;
			case 6:
				secession();
				break;
			case 7:
				changePassword();
				break;
			default:
				run = false;
			}
		} // while�� ��.
		System.out.println("���α׷� ����");
		scanner.close();
	}// ���� �޼ҵ� ��.

	// ���� �����ϱ�
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("���� ����");
		System.out.println("--------");
		System.out.print("������: ");
		String owner = scanner.next();
		boolean isRun = true;
		System.out.print("�ʱ� �Աݾ�: ");
		int balance = scanner.nextInt();
		while (isRun) {
			if (balance < 0) {
				System.out.println("�ʱ� �Աݾ��� Ȯ�� �� �ٽ� �Է��ϼ���.");
				System.out.print("�ʱ� �Աݾ�: ");
				balance = scanner.nextInt();
			} else {
				System.out.print("�����Ϸ��� ��й�ȣ�� �Է��ϼ���: ");
				String password = scanner.next();
				if (mkPw(password)) {
					Account account = new Account(ANO_NO + "-" + (++seq) + seq + seq, owner, balance, password);
					for (int i = 0; i < accountArray.length; i++) {
						if (accountArray[i] == null) {
							accountArray[i] = account;
							System.out.println("���: ���°� �����Ǿ����ϴ�.");
							isRun = !isRun;
							break;
						}
					}
				} else {
					System.out.println("���� ������ �����߽��ϴ�. �ٽ� �õ��ϼ���.");
					break;
				}
			}
		}
	}

	// ���� ��� ����
	private static void accountList() {
		System.out.println("--------");
		System.out.println("���� ���");
		System.out.println("--------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i]);
			}
		}
	}

	// �����ϱ�
	private static void deposit() {
		try {
			System.out.println("--------");
			System.out.println("����");
			System.out.println("--------");
			System.out.print("���� ��ȣ:");
			String ano = scanner.next();
			boolean isRun = true;
			while (isRun) {
				System.out.print("���ݾ�: ");
				int balance = scanner.nextInt();
				if (balance < 0) {
					System.out.println("���ݾ��� Ȯ���ϰ� �ٽ� �Է��ϼ���.");
				} else {
					Account account = findAccount(ano);
					account.setBalance(balance);
					System.out.println("���:������ �����Ǿ����ϴ�.");
					isRun = !isRun;
				}
			}
		} catch (Exception e) {
			System.out.println("���� ��ȣ�� Ȯ���ϼ���.");
		}
	}

	// ����ϱ�
	private static void withdraw() {
		/*
		 * System.out.println("--------"); System.out.println("���");
		 * System.out.println("--------"); System.out.print("���� ��ȣ:"); String ano =
		 * scanner.next(); System.out.print("��ݾ�: "); int balance = scanner.nextInt();
		 * Account account = findAccount(ano); account.setBalance(-balance);
		 * System.out.println("���:����� �����Ǿ����ϴ�.");
		 */
		try {
			System.out.println("--------");
			System.out.println("���");
			System.out.println("--------");
			System.out.print("���� ��ȣ:");
			String ano = scanner.next();
			Account account = findAccount(ano);
			for (int i = 0; i < 3; i++) {
				System.out.println();
			}
			System.out.println("�ܰ�: " + account.getBalance());
			boolean isRun = true;
			while (isRun) {
				System.out.print("��ݾ�: ");
				int balance = scanner.nextInt();
				if ((balance < 0) || (account.getBalance() < balance)) {
					System.out.println("��ݾ��� Ȯ���ϰ� �ٽ� �Է��ϼ���.");
				} else {
					account.setBalance(-balance);
					System.out.println("���: ����� �����Ǿ����ϴ�.");
					isRun = !isRun;
				}
			}
		} catch (Exception e) {
			System.out.println("���� ��ȣ�� Ȯ���ϼ���.");
		}
	}

	private static void transfer() {
		try {
			System.out.print("��� ���� ��ȣ: ");
			String ano1 = scanner.next();
			System.out.print("��� ���� ��ȣ: ");
			String ano2 = scanner.next();
			Account account2 = findAccount(ano2);
			Account account1 = findAccount(ano1);
			System.out.println("�ܰ�: " + account1.getBalance());
			boolean isRun = true;
			if (account1 != null & account2 != null) {
				while (isRun) {
					System.out.print("��ü��: ");
					int balance = scanner.nextInt();
					if ((balance < 0) || (account1.getBalance() < balance)) {
						System.out.println("��ü �ݾ��� Ȯ���ϰ� �ٽ� �Է��ϼ���.");
					} else {
						account1.setBalance(-balance);
						account2.setBalance(balance);
						System.out.println("���: ��ü�� �����Ǿ����ϴ�.");
						isRun = !isRun;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("���� ��ȣ�� Ȯ���ϼ���.");
		}

	}

	private static void changePassword() {
		try {
			System.out.print("���� ��ȣ: ");
			String ano = scanner.next();
			if (!(changePassword(ano).equals(null))) {
				findAccount(ano).setPassword(changePassword(ano));
				System.out.println("���: ��� ��ȣ ���� ����.");
			} else {
				System.out.println("���: ��� ��ȣ ���� ����.");
			}
		} catch (Exception e) {
			System.out.println("���¸� Ȯ���ϼ���.");
		}
	}

	private static void secession() {
		try {
			System.out.println("--------");
			System.out.println("ȸ�� Ż��");
			System.out.println("--------");
			System.out.print("Ż�� �� ���� ��ȣ> ");
			String ano = scanner.next();
			System.out.print("���� Ż���Ͻðڽ��ϱ�?(y/n)");
			char yesNo = scanner.next().charAt(0);
			if (yesNo == 'y' | yesNo == 'Y') {
				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i] != null) {
						if (accountArray[i].getAno().equals(ano)) {
							accountArray[i] = null;
							System.out.println("Ż�� �Ϸ�Ǿ����ϴ�.");
							break;
						}
					}
				}
			} else {
				System.out.println("Ż�� ��û�� ��ҵǾ����ϴ�.");
			}
		} catch (Exception e) {
			System.out.println("���� ��ȣ�� Ȯ���ϼ���.");
		}
	}

	// Account[]���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

	private static boolean mkPw(String password) {
		boolean isRun = false;
		int[] reTry = new int[3];
		for (int i = 0; i < reTry.length; i++) {
			System.out.print("��й�ȣ Ȯ��: ");
			String passwordC = scanner.next();
			if (password.equals(passwordC)) {
				isRun = true;
				break;
			} else if (i < (reTry.length - 1)) {
				System.out.println((reTry.length - (i + 1)) + "ȸ ���ҽ��ϴ�.\nȮ�� �� �ٽ� �Է��ϼ���.");
			}
		}
		return isRun;
	}

	private static boolean checkPassword(Account account) {
		boolean isRun = false;
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String password = scanner.next();
		int[] reTry = new int[3];
		for (int i = 0; i < reTry.length; i++) {
			if (account.getPassword().equals(password)) {
				isRun = true;
				break;
			} else if (i < (reTry.length - 1)) {
				System.out.println((reTry.length - (i + 1)) + "ȸ ���ҽ��ϴ�.\nȮ�� �� �ٽ� �Է��ϼ���.");
			}
		}
		return isRun;
	}

	private static String changePassword(String ano) {
		String newPassword = null;
		if (!(findAccount(ano).equals(null))) {
			System.out.println();
			if (checkPassword(findAccount(ano))) {
				System.out.print("������ ��� ��ȣ�� �Է��ϼ���: ");
				newPassword = scanner.next();
				System.out.print("��й�ȣ Ȯ��");
				String checkPassword = scanner.next();
				if (newPassword.equals(checkPassword)) {
					return newPassword;
				} else {
					newPassword = null;
				}
			}
		}
		return newPassword;
	}
}
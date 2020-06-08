package Exercise0514;

import java.util.Scanner;

public class BankApplicationTT {

	// run ������ �߰��� �����߽��ϴ�.
	// �Էµ� ���¹�ȣ�� ��й�ȣ�� �°� Ʋ���� ���� true, false�� ���� ����ǰ�
	// ��ü, ��й�ȣ����, Ż�� �޼ҵ� ����� ���� �߰��� while���̳� if���� ������ �� �Դϴ�.
	public static boolean run = false;

	private static final int ANO_NO = 111;
	private static int seq;
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.���� ���� | 2.���� ��� | 3.���� | 4.��� | 5.��ü | 6.��й�ȣ ���� | 7.Ż�� | 8.����");
			System.out.println("------------------------------------------------------------------------");
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
				changePassword();
				break; // ��й�ȣ�� �����ϴ� �޼ҵ� �߰�
			case 7:
				secession();
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

		// ��й�ȣ�� �Է¹޾� password ������ ����
		System.out.print("��й�ȣ �Է� : ");
		String password = scanner.next();
		System.out.print("��й�ȣ Ȯ�� : ");// pwdCheck=>���Ϸ��� ���� ���� Account��ü�� �Է�X
		String agianPassword = scanner.next();
		if (!(password.equals(agianPassword))) {
			System.out.println("��й�ȣ�� Ȯ���ϼ���");
		} else {
			System.out.print("�ʱ� �Աݾ�: ");
			int balance = scanner.nextInt();
			Account account = new Account(ANO_NO + "-" + (++seq) + seq + seq, owner, balance, password);
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i] == null) {
					accountArray[i] = account;
					break;
				}
			}
			System.out.println("���: ���°� �����Ǿ����ϴ�.");
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
		System.out.println("--------");
		System.out.println("����");
		System.out.println("--------");
		System.out.print("���� ��ȣ:");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		account.setBalance(balance);
		System.out.println("���:������ �����Ǿ����ϴ�.");

	}

	// ����ϱ�
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("���");
		System.out.println("--------");
		System.out.print("���� ��ȣ:");
		String ano = scanner.next();

		// ��й�ȣ�� �Է¹޴� �κ� �߰�
		System.out.print("��й�ȣ �Է� : ");
		String password = scanner.next();

		pwdCheck(ano, password);

		if (run == true) {
			System.out.print("��ݾ�: ");

			int balance = scanner.nextInt();
			Account account = findAccount(ano);
			account.setBalance(-balance);
			System.out.println("���:����� �����Ǿ����ϴ�.");
		}
	}

	// ��ü �޼ҵ�
	private static void transfer() {
		System.out.println("--------");
		System.out.println("��ü");
		System.out.println("--------");
		System.out.print("����� ���� ��ȣ> ");
		String ano1 = scanner.next();
		Account account1 = findAccount(ano1);

		// ��й�ȣ�� �Է¹޴� �κ� �߰�
		System.out.print("��й�ȣ �Է� : ");
		String password = scanner.next();

		// �Էµ� ������ ���� ���� ��ü�� �����ϰ� �ִ����� Ȯ���մϴ�.
		// ���� �´ٸ� run ������ true ���� ���� �Ʒ��� if ���� �����ϰ� �˴ϴ�.
		pwdCheck(ano1, password);

		if (run == true) {
			System.out.print("��� ���� ��ȣ> ");
			String ano2 = scanner.next();
			Account account2 = findAccount(ano2);
			System.out.print("��ü �ݾ�> ");
			int balance = scanner.nextInt();
			account1.setBalance(-balance);
			account2.setBalance(balance);
			System.out.println("���: ��ü�� �����Ǿ����ϴ�.");
		} // if

	}

	// ��й�ȣ ���� �޼ҵ�
	private static void changePassword() {
		System.out.println("----------");
		System.out.println("��й�ȣ ����");
		System.out.println("----------");

		System.out.print("������ ��й�ȣ�� ���¹�ȣ �Է� > ");
		String ano = scanner.next();

		System.out.print("���� ��й�ȣ �Է� : ");
		String password = scanner.next();

		// �Էµ� ������ ���� ���� ��ü�� �����ϰ� �ִ����� Ȯ���մϴ�.
		// ���� �´ٸ� run ������ true ���� ���� �Ʒ��� while ���� �����ϰ� �˴ϴ�.
		pwdCheck(ano, password);

		// �� ��й�ȣ�� ���� �װ� ����� �Է��� �� ���� �ݺ��ϴ� while�� �Դϴ�.
		while (run) {
			System.out.print("�� ��й�ȣ �Է� : ");
			String newPassword = scanner.next();

			System.out.print("�� ��й�ȣ Ȯ���� ���� �ٽ� �Է����ּ��� : ");
			String againPassword = scanner.next();

			// �Էµ� �� ��й�ȣ�� �°� �ԷµǾ����� Ȯ���մϴ�.
			if (againPassword.equals(newPassword)) {
				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i].getAno().equals(ano)) {
						accountArray[i].setPassword(againPassword);
						System.out.println("��й�ȣ ������ �Ϸ� �Ǿ����ϴ�.");
						run = false; // while�� ����
						break; // for�� ����������
					}
				}
			} else
				System.out.println("�� ��й�ȣ�� ���� �ʽ��ϴ�.");

		} // while
	}

	// Ż�� �޼ҵ�
	private static void secession() {
		System.out.println("--------");
		System.out.println("ȸ�� Ż��");
		System.out.println("--------");
		System.out.print("Ż�� �� ���� ��ȣ> ");
		String ano = scanner.next();

		System.out.print("��й�ȣ �Է� : ");
		String password = scanner.next();
		pwdCheck(ano, password);

		// pwdCheck �޼ҵ忡�� ano�� password�� ���� ������ ��ü�� �����ؾ��� if���� ���� �� �� �ֽ��ϴ�.
		if (run == true) {
			System.out.print("���� Ż���Ͻðڽ��ϱ�?(y/n)");
			char yesNo = scanner.next().charAt(0);
			if (yesNo == 'y') {
				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i].getAno().equals(ano)) {
						accountArray[i] = null;
						System.out.println("Ż�� �Ϸ�Ǿ����ϴ�.");
						break;
					}
				} // for
			} // yesNo�� ���� if
		} // run�� ���� if
	}

	// Account[]���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				account = accountArray[i];
				break;
			}
		}
		return account;
	}

	// ��й�ȣ Ȯ�� �޼ҵ�
	private static void pwdCheck(String ano, String password) {
		for (int i = 0; i < accountArray.length; i++) {// �迭��ü�� ��� ��ȯ�ؼ�
			if (accountArray[i].getAno().equals(ano)) {// �� �� �Էµ� ���¹�ȣ�� ���� ��ü�� ã��
				if (accountArray[i].getPassword().equals(password)) {
					// �Էµ� ��й�ȣ�� �� ��ü�� ��й�ȣ�� ������ Ȯ�� �� ����
					// ���ٸ� ~break; ������ �����ϰ� �ش� �޼ҵ�� ����˴ϴ�.
					run = true;
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					run = false;
					break;
				}
			} // for �� if
		} // for
	}

}// class ��
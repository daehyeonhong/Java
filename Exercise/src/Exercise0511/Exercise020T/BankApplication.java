package Exercise0511.Exercise020T;

import java.util.Scanner;

public class BankApplication {
	private static final int ANO_NO = 111;
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.���� ���� | 2.���� ��� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------");
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
			default:
				run = false;
			}
		} // while�� ��.
		System.out.println("���α׷� ����");
	}// ���� �޼ҵ� ��.

	// ���� �����ϱ�
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("���� ����");
		System.out.println("--------");
		System.out.print("���� ��ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ� �Աݾ�: ");
		int balance = scanner.nextInt();
		Account account = new Account(ANO_NO + "-" + ano, owner, balance);
		// System.out.println(account);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				break;
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
		System.out.println("--------");
		System.out.println("����");
		System.out.println("--------");
		System.out.print("���� ��ȣ:");
		String ano = scanner.next();
		System.out.print("�Աݾ�: ");
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
		System.out.print("��ݾ�: ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		account.setBalance(-balance);
		System.out.println("���:����� �����Ǿ����ϴ�.");
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
}
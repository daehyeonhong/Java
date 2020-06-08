package Exercise0513S;

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
			System.out.println("1.���� ���� | 2.���� ��� | 3.���� | 4.��� | 5.��ü | 6.Ż�� | 7.����");
			System.out.println("----------------------------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:createAccount();break;
			case 2:accountList();break;
			case 3:deposit();break;
			case 4:withdraw();break;
			case 5:transfer();break;
			case 6:secession();break;
			default:run = false;
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
		System.out.print("�ʱ� �Աݾ�: ");
		int balance = scanner.nextInt();
		Account account = new Account(ANO_NO + "-" + (++seq) + seq + seq, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
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
		System.out.print("��ݾ�: ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		account.setBalance(-balance);
		System.out.println("���:����� �����Ǿ����ϴ�.");
	}

	private static void transfer() {
		System.out.print("��� ���� ��ȣ> ");
		String ano1 = scanner.next();
		Account account1 = findAccount(ano1);
		System.out.print("��� ���� ��ȣ> ");
		String ano2 = scanner.next();
		Account account2 = findAccount(ano2);
		System.out.print("��ü �ݾ�> ");
		int balance = scanner.nextInt();
		account1.setBalance(-balance);
		account2.setBalance(balance);
		System.out.println("���: ��ü�� �����Ǿ����ϴ�.");

	}

	private static void secession() {
		System.out.println("--------");
		System.out.println("ȸ�� Ż��");
		System.out.println("--------");
		System.out.print("Ż�� �� ���� ��ȣ> ");
		String ano = scanner.next();
		System.out.print("���� Ż���Ͻðڽ��ϱ�?(y/n)");
		char yesNo = scanner.next().charAt(0);
		if (yesNo == 'y') {
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i].getAno().equals(ano)) {
						accountArray[i] = null;
						System.out.println("Ż�� �Ϸ�Ǿ����ϴ�.");
						break;
				}
			}
		}
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
}
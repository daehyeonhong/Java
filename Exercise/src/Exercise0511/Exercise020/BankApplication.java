package Exercise0511.Exercise020;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int seq = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.���� ���� | 2.���� ��� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

	// ���� �����ϱ�
	private static void createAccount() {
		System.out.println("------");
		System.out.println("���� ����");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ� �Աݾ�: ");
		int balance = scanner.nextInt();
		Account account = new Account(ano, owner, balance);
		accountArray[seq] = account;
		seq++;
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
		System.out.println(seq);

	}

	// ���� ��� ����
	private static void accountList() {
		// �ۼ� ��ġ
		System.out.println("------");
		System.out.println("���� ���");
		System.out.println("------");
		for (int i = 0; i <= seq; i++) {
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}

	// �����ϱ�
	private static void deposit() {
		// �ۼ� ��ġ
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int balance = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				accountArray[i].setBalance(balance);
			}
		}

	}

	// ����ϱ�
	private static void withdraw() {
		// �ۼ� ��ġ
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		int balance = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				accountArray[i].setBalance(-balance);
			}
		}
	}

	// Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		return null;

	}
}
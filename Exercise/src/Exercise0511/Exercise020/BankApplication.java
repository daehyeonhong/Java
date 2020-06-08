package Exercise0511.Exercise020;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int n;
	static int seq;
	static String ano;
	static String owner;
	static int balance;

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

	private static void createAccount() {
		System.out.println(seq);
		accountArray[seq] = new Account(ano, owner, balance);
		System.out.println("--------");
		System.out.println("���� ����");
		System.out.println("--------");
		System.out.print("���� ��ȣ: ");
		ano = scanner.next();
		accountArray[seq].setAno(ano);
		System.out.print("���� ��: ");
		owner = scanner.next();
		accountArray[seq].setOwner(owner);
		System.out.print("�ʱ� �Աݾ�: ");
		balance = scanner.nextInt();
		accountArray[seq].setBalance(balance);
		seq++;
	}

	private static void accountList() {
		System.out.println("--------");
		System.out.println("���� ���");
		System.out.println("--------");
		for (int i = 0; i < seq; i++) {
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}

	private static void deposit() {
		int sum = 0;
		System.out.println("--------");
		System.out.println("����");
		System.out.println("--------");
		System.out.print("���� ��ȣ: ");
		ano = scanner.next();
		System.out.print("���ݾ�: ");
		balance = scanner.nextInt();
		sum = findAccount(ano).getBalance() + balance;
		findAccount(ano).setBalance(sum);
		System.out.println("���: ������ �����Ǿ����ϴ�.");
	}

	private static void withdraw() {
		int minus = 0;
		System.out.println("--------");
		System.out.println("���");
		System.out.println("--------");
		System.out.print("���� ��ȣ: ");
		ano = scanner.next();
		System.out.print("��ݾ�: ");
		balance = scanner.nextInt();
		minus = findAccount(ano).getBalance() - balance;
		findAccount(ano).setBalance(minus);
		System.out.println("���: ����� �����Ǿ����ϴ�.");

	}

	private static Account findAccount(String ano) {
		n = 0;
		for (int i = 0; i < seq; i++) {

			if (!(accountArray[i].getAno().equals(null)) && accountArray[i].getAno().equals(ano)) {
				n = i;
			}
		}
		return accountArray[n];
	}
}

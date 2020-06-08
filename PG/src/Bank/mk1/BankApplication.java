package Bank.mk1;

import java.util.Scanner;

public class BankApplication {
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
			try {
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

			} catch (Exception e) {
				System.err.println("�Է� ����");
				break;
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
		System.out.print("�����Ϸ��� ��й�ȣ�� �Է��ϼ���.");
		String password = scanner.next();
		if (setPassword(password) == null) {
			System.out.println("��й�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
		} else {
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i] == null) {
					System.out.print("�ʱ� �Աݾ��� �Է��ϼ���: ");
					int balance = scanner.nextInt();
					accountArray[i] = new Account((ANO_NO + "-" + (++seq) + seq + seq), owner, balance, password);
					System.out.println("���°� �����Ǿ����ϴ�.");
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
		System.out.println("--------");
		System.out.println("����");
		System.out.println("--------");
		System.out.print("���� ��ȣ:");
		String ano = scanner.next();
		System.out.print("�Աݾ��� �Է��ϼ���");
		if (findAccount(ano) != accountArray.length) {
			int balance = scanner.nextInt();
			if (balance >= 0) {
				accountArray[findAccount(ano)].setBalance(balance);
				System.out.println("���:������ �����Ǿ����ϴ�.");
			} else {
				System.out.println("�Աݾ��� Ȯ�� �� �ٽ� �õ��ϼ���.");
			}
		} else {
			System.out.println("���� ��ȣ�� Ȯ�� �� �õ��ϼ���.");
		}
	}

	// ����ϱ�
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("���");
		System.out.println("--------");
		System.out.print("���� ��ȣ:");
		String ano = scanner.next();
		if (findAccount(ano) != accountArray.length) {
			if (pwdCheck(ano)) {
				System.out.println("���� �ܰ�: " + accountArray[findAccount(ano)].getBalance() + "�� �Դϴ�");
				System.out.print("��ݾ��� �Է��ϼ���: ");
				int balance = scanner.nextInt();
				if (balance >= 0 && accountArray[findAccount(ano)].getBalance() >= balance) {
					accountArray[findAccount(ano)].setBalance(-balance);
					System.out.println("���: ����� �Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("��ݾ��� Ȯ���ϼ���.");
				}
			} else {
				System.out.println("��й�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
			}
		} else {
			System.out.println("���¹�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
		}
	}

	// ��ü �޼ҵ�
	private static void transfer() {
		System.out.println("--------");
		System.out.println("��ü");
		System.out.println("--------");
		System.out.print("��� ���¹�ȣ: ");
		String ano1 = scanner.next();
		if (findAccount(ano1) <= accountArray.length) {
			System.out.print("��� ���¹�ȣ�� �Է��ϼ���: ");
			String ano2 = scanner.next();
			if (findAccount(ano2) <= accountArray.length) {
				if (pwdCheck(ano1)) {
					System.out.println("���� �ܰ�: " + accountArray[findAccount(ano1)].getBalance() + "�� �Դϴ�.");
					System.out.print("��ü �ݾ��� �Է��ϼ���: ");
					int balance = scanner.nextInt();
					if ((balance >= 0) && (accountArray[findAccount(ano1)].getBalance() >= balance)) {
						accountArray[findAccount(ano1)].setBalance(-balance);
						accountArray[findAccount(ano2)].setBalance(balance);
						System.out.println("���: ��ü ����");
					} else {
						System.out.println("��ü �ݾ��� Ȯ�� �� �ٽ� �õ��ϼ���.");
					}
				} else {
					System.out.println("��й�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
				}
			} else {
				System.out.println("��� ���¹�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
			}
		} else {
			System.out.println("���¹�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
		}
	}

	// ��й�ȣ ���� �޼ҵ�
	private static void changePassword() {
		System.out.println("----------");
		System.out.println("��й�ȣ ����");
		System.out.println("----------");

		System.out.print("������ ��й�ȣ�� ���¹�ȣ �Է� > ");
		String ano = scanner.next();
		if (findAccount(ano) < accountArray.length) {
			if (pwdCheck(ano)) {
				System.out.print("���ο� ��й�ȣ�� �Է��ϼ���: ");
				String password = scanner.next();
				if (setPassword(password) != null) {
					accountArray[findAccount(ano)].setPassword(password);
					System.out.println("���: ��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("������ ��й�ȣ�� Ȯ�� �� �ٽ� �õ��ϼ���.");
				}
			} else {
				System.out.println("��й�ȣ�� Ȯ�� �� �ٽ� �õ��ϼ���.");
			}
		} else {
			System.out.println("���¹�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
		}
	}

	// Ż�� �޼ҵ�
	private static void secession() {
		System.out.println("--------");
		System.out.println("ȸ�� Ż��");
		System.out.println("--------");
		System.out.print("Ż�� �� ���� ��ȣ> ");
		String ano = scanner.next();
		if (findAccount(ano) < accountArray.length) {
			if (pwdCheck(ano)) {
				System.out.println("���� Ż���Ͻðڽ��ϱ�?\n[Y/N]");
				char yesNo = scanner.next().charAt(0);
				if (yesNo == 'y' || yesNo == 'Y') {
					accountArray[findAccount(ano)] = null;
					System.out.println("���: Ż�� ó�� �Ϸ�.");
				} else {
					System.out.println("Ż�� ���");
				}
			} else {
				System.out.println("��й�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
			}
		} else {
			System.out.println("���¹�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
		}

		System.out.println();

	}

	// Account[]���� ano�� ������ Account ��ü ã��
	private static int findAccount(String ano) {
		int anoNo = 0;
		for (int i = 0; i < accountArray.length; i++) {
			if (!(accountArray[i] == (null)) && accountArray[i].getAno().equals(ano)) {
				anoNo = i;
				break;
			} else {
				anoNo = accountArray.length;
			}
		}
		return anoNo;
	}

	private static String setPassword(String password1) {
		System.out.print("��й�ȣ�� �Է��ϼ���: ");
		String password2 = scanner.next();
		if (password1.equals(password2)) {
		} else {
			password1 = null;
		}
		return password1;
	}

	// ��й�ȣ Ȯ�� �޼ҵ�
	private static boolean pwdCheck(String ano) {
		accountArray[findAccount(ano)].getPassword();
		System.out.print("��й�ȣ Ȯ��: ");
		String checkPwd = scanner.next();
		if (accountArray[findAccount(ano)].getPassword().equals(checkPwd)) {
			return true;
		} else {
			return false;
		}
	}
}
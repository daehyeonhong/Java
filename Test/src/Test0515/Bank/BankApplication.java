package Test0515.Bank;

import java.util.Scanner;

public class BankApplication {

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
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1.���� ���� | 2.�α���&�α׾ƿ� | 3.���� ��� | 4.���� | 5.��� | 6.��ü | 7.��й�ȣ ���� | 8.Ż�� | 9.����");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				logon();
				break;
			case 3:
				accountList();
				break;
			case 4:
				deposit();
				break;
			case 5:
				withdraw();
				break;
			case 6:
				transfer();
				break;
			case 7:
				changePassword();
				break; // ��й�ȣ�� �����ϴ� �޼ҵ� �߰�
			case 8:
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
		String againPassword = scanner.next();
		if (!(password.equals(againPassword))) {
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

	private static void logon() {
		System.out.println("--------------");
		System.out.println("���� �α���&�α׾ƿ�");
		System.out.println("--------------");
		System.out.print("���¹�ȣ�� �Է��ϼ���: ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("���: ���¹�ȣ ����\n���¹�ȣ Ȯ�� �� �ٽ� �õ����ּ���.");
		} else {
			account.isLogon();
			if (account.isLogon() == true) {
				System.out.println("�α׾ƿ� �Ͻðڽ��ϱ�?\n[Y/N]");
				char yesNo = scanner.next().charAt(0);
				if (yesNo == 'y' || yesNo == 'Y') {
					account.setLogon(!account.isLogon());
					System.out.println("���: �α׾ƿ� �Ǿ����ϴ�.");
				} else {
					account.setLogon(account.isLogon());
					System.out.println("���: �α׾ƿ� ��û�� ��ҵǾ����ϴ�.");
				}
			} else {
				for (int i = 0; i < 3; i++) {
					System.out.print("��й�ȣ�� �Է��ϼ���: ");
					String password = scanner.next();
					pwdCheck(account.getAno(), password);
					if (run == true) {
						System.out.println(account.getOwner() + "�� �α��� �Ǿ����ϴ�.");
						account.setLogon(!account.isLogon());
						break;
					} else {
						if (i != 2) {
							System.out.println("��й�ȣ ����!!!\n" + (3 - (i + 1)) + "ȸ ���ҽ��ϴ�.");
						} else if (i == 2) {
							System.out.println("3ȸ ����!!! �ٽ� �õ��ϼ���.");
						}
					}
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
		Account account = findAccount(ano);
		if (account != null) {
			if (account.isLogon() == true) {
				System.out.println(account.getOwner() + "�� ȯ���մϴ�. ���ݾ��� �Է����ּ���.");
				System.out.print("���ݾ�: ");
				int balance = scanner.nextInt();
				account.setBalance(balance);
				System.out.println("���:������ �����Ǿ����ϴ�.");
			} else {
				System.out.println("�α��� �� �ٽ� �õ��ϼ���.");
			}
		} else {
			System.out.println("���¹�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
		}
	}

	// ����ϱ�
	private static void withdraw() {
		try {
			System.out.println("--------");
			System.out.println("���");
			System.out.println("--------");
			System.out.print("���� ��ȣ:");
			String ano = scanner.next();
			Account account = findAccount(ano);
			// ��й�ȣ�� �Է¹޴� �κ� �߰�

			if (account != null) {

				if (account.isLogon() == true) {
					System.out.println();
					System.out.println(account.getOwner() + "�� ȯ���մϴ�. ����� ���� ��й�ȣ�� �Է����ּ���.");
					for (int i = 0; i < 3; i++) {
						System.out.print("��й�ȣ �Է� : ");
						String password = scanner.next();
						pwdCheck(ano, password);
						if (run == true) {
							break;
						} else {
							System.out.println("��й�ȣ ����!!!");
							if (i < 2) {
								System.out.println((3 - (i + 1)) + "ȸ ���ҽ��ϴ�.");
							} else if (i == 2) {
								System.out.println("��й�ȣ ����! Ȯ�� �� �ٽ� �õ��ϼ���");
							}
						}
					}
					if (run == true) {
						System.out.println(account.getOwner() + "���� �ܰ�: " + account.getBalance() + "�� �Դϴ�.");
						System.out.print("��ݾ�: ");
						int balance = scanner.nextInt();
						if (balance <= 0) {
							System.out.println("��ݾ��� Ȯ�� �� �ٽ� �õ����ּ���");
						}
						account.setBalance(-balance);
						System.out.println("���: ����� �����Ǿ����ϴ�.");
					} else {
						System.out.println("���: ��� ����! �ٽ� �õ��ϼ���.");
					}
				} else {
					System.out.println("�α��� �� �ٽ� �õ��ϼ���.");
				}
			} else {
				System.out.println("���¹�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
			}
		} catch (Exception e) {
			System.out.println("���¹�ȣ Ȯ�� �� �ٽ� �õ����ּ���.");
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

		if (account1 != null) {

			if (account1.isLogon() == true) {
				System.out.println(account1.getOwner() + "�� ȯ���մϴ�. ����� ���� ��й�ȣ�� �Է����ּ���.");
				// ��й�ȣ�� �Է¹޴� �κ� �߰�
				System.out.print("��й�ȣ �Է� : ");
				String password = scanner.next();

				// �Էµ� ������ ���� ���� ��ü�� �����ϰ� �ִ����� Ȯ���մϴ�.
				// ���� �´ٸ� run ������ true ���� ���� �Ʒ��� if ���� �����ϰ� �˴ϴ�.
				pwdCheck(ano1, password);
				if (run == true) {
					System.out.print("��ü ��� ���¹�ȣ: ");
					String ano2 = scanner.next();
					Account account2 = findAccount(ano2);

					if (account2 != null) {
						System.out.print("��ü �ݾ�: ");
						int balance = scanner.nextInt();

						if (balance < account1.getBalance()) {
							account1.setBalance(-balance);
							account2.setBalance(balance);
							System.out.println("���: ��ü�� �����Ǿ����ϴ�.");
						} else {
							System.out.println("��ü �ݾ��� Ȯ�� �� �ٽ� �õ��ϼ���.");
						}
					} else {
						System.out.println("���: ��ü ����! ���� ���¹�ȣ�� Ȯ�� �� �ٽ� �õ��ϼ���.");
					} // if else
				}
			} else {
				System.out.println("�α��� �� �ٽ� �õ��ϼ���.");
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
		System.out.print("��й�ȣ�� ������ ���¹�ȣ �Է� > ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if (account != null) {
			if (account.isLogon() == true) {
				System.out.println(account.getOwner() + "�� ȯ���մϴ�. ȸ��Ż�� ���� ��й�ȣ�� �Է����ּ���.");

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
				}
			} else {
				System.out.println("�α��� �� �ٽ� �õ��ϼ���.");
			} // while
		} else {
			System.out.println("���¹�ȣ�� Ȯ�� �� �ٽ� �õ��ϼ���.");
		}
	}

	// Ż�� �޼ҵ�
	private static void secession() {
		try {
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
				if (yesNo == 'y' || yesNo == 'Y') {
					for (int i = 0; i < accountArray.length; i++) {
						if (accountArray[i].getAno().equals(ano)) {
							accountArray[i] = null;
							System.out.println("���: Ż�� �Ϸ�Ǿ����ϴ�.");
							break;
						}
					} // for
				} else {
					System.out.println("���: Ż�� ��û�� ��ҵǾ����ϴ�.");
				} // yesNo�� ���� if
			} // run�� ���� if
		} catch (Exception e) {
			System.out.println("���¹�ȣ Ȯ�� �� �ٽ� �õ��ϼ���.");
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

	// ��й�ȣ Ȯ�� �޼ҵ�
	private static void pwdCheck(String ano, String password) {
		Account account = findAccount(ano);
		if (account != null && account.getPassword().equals(password)) {
			run = true;
		} else {
			run = false;
		}
	}

	private static String pwd3Check(String ano) {
		String password = null;
		for (int i = 0; i < 3; i++) {
			System.out.print("��й�ȣ �Է� : ");
			password = scanner.next();
			pwdCheck(ano, password);
			if (run == true) {
				break;
			} else {
				System.out.println("��й�ȣ ����!!!");
				if (i < 2) {
					System.out.println((3 - (i + 1)) + "ȸ ���ҽ��ϴ�.");
				} else if (i == 2) {
					System.out.println("��й�ȣ ����! Ȯ�� �� �ٽ� �õ��ϼ���");
				}
			}
		}
		return password;
	}
}// class ��
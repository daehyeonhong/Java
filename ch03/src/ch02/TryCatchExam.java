package ch02;

import java.util.Scanner;

public class TryCatchExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {//��ɹ�
			int num = scanner.nextInt();
			System.out.println("���:"+num);
		} catch (Exception e) {//Exception e; <-����(����)�߻��� JVM�� ���ܰ�ü�� ������.
			//���� �߻��� ó�� ��ɹ�, ���� �޽��� ��¹�
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
		}
		scanner.close();
	}
}

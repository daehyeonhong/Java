package ch02;

import java.util.Scanner;

public class CannerExample2 {
	public static void main(String[] args) {
		String str;
		//Scanner �ν��Ͻ� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���:");
		//�� �� �Է� �ޱ�
		str = scanner.nextLine();
		
		//�� ���� ���ڿ��� ������(" ")�� �������� �߶� ���ڿ� �迭�� ���� -split(" ")
		//["kim"]["seoul"]["20][65.1][true]
		String[] infos = str.split(" ");
		
		for(int i=0;i<infos.length;i++) {
			System.out.println(infos[i]);
		}
		//Scanner �ڿ�����
		scanner.close();
	}
}

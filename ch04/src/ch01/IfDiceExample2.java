package ch01;

public class IfDiceExample2 {
	public static void main(String[] args) {
		boolean isRun = true;

		while (isRun) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("ù ��° �ֻ���:" + num1);
			System.out.println("�� ��° �ֻ���:" + num2);
			if(num1 + num2 == 5) {
				System.out.println("�� �ֻ��� ���� ��: "+(num1 + num2)+"�����մϴ�.");
				isRun = !isRun;
			} else {
				System.out.println("�� �ֻ��� ���� ��: "+(num1 + num2));
			}
		}
	}
}

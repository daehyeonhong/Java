package ch01;

public class IfDiceExample2 {
	public static void main(String[] args) {
		boolean isRun = true;

		while (isRun) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("첫 번째 주사위:" + num1);
			System.out.println("두 번째 주사위:" + num2);
			if(num1 + num2 == 5) {
				System.out.println("두 주사위 눈의 합: "+(num1 + num2)+"정지합니다.");
				isRun = !isRun;
			} else {
				System.out.println("두 주사위 눈의 합: "+(num1 + num2));
			}
		}
	}
}

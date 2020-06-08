package ch02;

public class ForDiceExample1 {
	public static void main(String[] args) {
		int dice1;//1~6 정수
		int dice2;//1~6 정수

		for (;;) {
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			System.out.println("dice1="+dice1+",dice2="+dice2);
			if (dice1+dice2==10) break;//반복 블럭을 빠져나가는 명령문;
		}
		System.out.println("10이 되는 주사위 눈금:"+dice1+","+dice2);
	}
}

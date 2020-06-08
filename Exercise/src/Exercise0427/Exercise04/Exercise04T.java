package Exercise0427.Exercise04;

//4. while문과 Math.random()메소드를 이용해서 주사위 눈 출력
//두 눈의 합이 5이면 종료
public class Exercise04T {
	public static void main(String[] args) {
		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			int sum = dice1 + dice2;
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			if (sum == 5)
				break;
		}
	}
}
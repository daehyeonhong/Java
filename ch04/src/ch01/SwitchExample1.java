package ch01;

public class SwitchExample1 {
	public static void main(String[] args) {
		char day = '화';

		switch (day) {
		case '월':
			System.out.println("한 주의 시작");
			break;//switch블럭 내에서 블럭을 빠져나가는 명령문
		case '화':
			System.out.println("한 주의 둘째 날");
			break;
		case '수':
			System.out.println("주의 중간");
			break;
		case '목':
			System.out.println("주말이 기다려지는 날");
			break;
		case '금':
			System.out.println("신 주말");
			break;
		case '토':
			System.out.println("주말이다.");
			break;
		default:
			System.out.println("일요일");
			break;
		}
	}
}

package ch01;

public class SwitchExample3 {
	public static void main(String[] args) {
		char day = '화';

		switch (day) {
		case '월':
		case '화':
		case '수':
		case '목':System.out.println("열심히 공부합니다.");
			break;
		case '금':System.out.println("주말이 기다려집니다.");
			break;
		case '토':
		case '일':System.out.println("집에서 쉽니다.");
		}
	}
}

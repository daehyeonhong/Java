package ch04;

public class SwitchExample {
	public static void main(String[] args) {
		int time = 9;
		
		switch (time) {
		case 6:
			System.out.println("기상");
		case 7:
			System.out.println("운동");
		case 8:
			System.out.println("식사");
			break;
		case 9:
			System.out.println("출근");
		case 10:
			System.out.println("회의");
		default:
			System.out.println("근무");
		}
	}
}
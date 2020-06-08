package ch01;

public class SwitchExample2 {
	public static void main(String[] args) {
		int time = 7;
		
		switch (time) {
		case 7:System.out.println("기상");
		case 8:System.out.println("식사");
		case 9:System.out.println("출근");
		case 10:System.out.println("회의");
		case 11:System.out.println("출장");
		case 12:System.out.println("점심");
		default:System.out.println("근무");
		}
	}
}
package ch02;

public class BreakUpExample {
	public static void main(String[] args) {
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower < 'z'; lower++) {
				System.out.println(upper+"_"+lower);
				if (lower == 'g') {
					if (lower=='g') {
						break Outter;
					}
				}
			}			
		}System.out.println("프로그램 종료");
	}
}
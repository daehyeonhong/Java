package ch01;

public class RunHello {
	public static void main(String[] args) {
		boolean play = true;
		int count = 0;
		
		while (play) {
			count++;
			
			if (count < 6) {
				System.out.println("hello!");
			} else {
				play =! play;
			}
		}
		
		System.out.println("Á¾·á");
	}
}
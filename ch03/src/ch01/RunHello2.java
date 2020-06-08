package ch01;

public class RunHello2 {
	public static void main(String[] args) {
		boolean play = true;
		int count = 0;
		
		while(play) {
			System.out.println("hello!");
			++count;
			
			if(count == 5) {
				play =! play;
			}
		}
		System.out.println("Á¾·á");
	}
}

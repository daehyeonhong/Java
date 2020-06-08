package ch01;

public class RunHello1 {
	public static void main(String[] args) {
		boolean play = true;
		int count = 0;
		
		while(play) {
			count++;
			
			if(count == 6) {
				play =! play;
			}else {
				System.out.println("hello!");
			}
		}
		
		System.out.println("Á¾·á");
	}
}

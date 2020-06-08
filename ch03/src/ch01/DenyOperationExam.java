package ch01;

public class DenyOperationExam {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);//true
		
		play =! play;//!true = false
		
		
		System.out.println(play);//false
		
		play =! play;
		
		while(play) {
			System.out.println("hello");
			System.out.println("계속할까요?");
			char yesNo = 'n';
			if(yesNo == 'n') {//'n' == 'n'
				play = !play;
			}
			
			/*if(int i = 0; i < 4; i++) {
				play = !play;
			}*/
		}
		System.out.println("종료");
	}
}

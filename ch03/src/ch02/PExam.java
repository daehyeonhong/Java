package ch02;

public class PExam {
	public static void main(String[] args) {
		int p = 127;
		int d, j;
		
		d = p/12;
		j = p%12;
		
		System.out.println(d+"다스");
		System.out.println(j+"자루");
		
		
		int i = 12324;
		int a = ~i;
		
		System.out.println(a);
	}
}

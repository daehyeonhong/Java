package ch01;

public class ifNestedExample {
	public static void main(String[] args) {

		int score = (int)(Math.random()*20)+81;
		System.out.println("����:"+score);

		String grade;
		if (score>=90) {
			if (score>=95) {
				grade="a+";
			} else {
				grade="A";
			}
		} else {
			if (score>85) {
				grade="B+";
			} else {
				grade="B";
			}
		}System.out.println("����:"+grade);
	}
}

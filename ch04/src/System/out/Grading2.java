package System.out;

import java.util.Scanner;

public class Grading2 {
	public static void main(String[] args) {
		String grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100)");
		int score = scanner.nextInt();
		if(score>=90) {
			if(score>95) grade="A+";
			else if(score<95) grade="A-";
			else grade="A0";
		}
		else if(score>=80) {
			if (score>85) 
				grade="B+";
			 else if (score<85) grade="B+";
			 else grade="B0";
			}
		else if(score>=70) {
			if(score>75) grade="C+";
			else if(score<75) grade="C-";
			else grade="C0";
		}
		else if(score>=60) {
			if(score>65) grade="D+";
			else if(score<65) grade="D-";
			else grade="D0";
		}
		else grade="F";
		System.out.println(grade+"등급입니다.");
		scanner.close();
	}
}

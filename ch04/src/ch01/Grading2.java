package ch01;

import java.util.Scanner;

public class Grading2 {
	public static void main(String[] args) {
		String grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���(0~100)");
		int score = scanner.nextInt();
		if (score>=90) {
			if (score>95) {
				grade="A+";
			} else if (score<95) {
				grade="A-";
			} else {
				grade="A0";
			}
		}

		if (score>=80) {
			if (score>85) {
				grade="B+";
			} else if (score<85) {
				grade="B-";
			} else {
				grade="B0";
			}
		}
		
		if (score>=70) {
			if (score>75) {
				grade="C+";
			} else if (score<75) {
				grade="C-";
			} else {
				grade="C0";
			}
		}
		
		if (score>=60) {
			if (score>65) {
				grade="D+";
			} else if (score<65) {
				grade="D-";
			} else {
				grade="D0";
			}
		}
		
		if (score>=50) {
			if (score>55) {
				grade="E+";
			} else if (score<55) {
				grade="E-";
			} else {
				grade="E0";
			}
		}
		
		else {
			grade="F";
		}
		
		System.out.println(score+"����"+"�����: "+grade+"�� �Դϴ�.");
		scanner.close();
		}
	}

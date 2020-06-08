package ch04;

public class IfExample2 {
	public static void main(String[] args) {
		int score = 86;
		String result = "";

		if (score >= 90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";
		} else if (score >= 70) {
			result = "C";
		} else {
			result = "F";
		}
		System.out.println("결과: " + result);

		if (score >= 90) {
			if (score > 95) {// 95<score<=100
				result = "A+";
			} else if (score < 95) {// 90<=score<95
				result = "A-";
			} else {
				result = "A0";// score==95
			}
		} else if (score >= 80) {
			if (score > 85) {
				result = "B+";
			} else if (score < 85) {
				result = "B-";
			} else {
				result = "B0";
			}
		} else if (score >= 70) {
			result = "C";
		} else {
			result = "F";
		}
		System.out.println("결과: " + result);
	}
}
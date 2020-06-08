package ch01;

public class ThrowExam {
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void method() throws Exception {
		throw new Exception("비상! 비상! 비상!");
	}
}
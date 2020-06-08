package ch02;

public class TryCatchExam6 {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void m1() throws Exception{
		m2();
	}
	public static void m2() throws Exception{
		m3();
	}
	public static void m3() throws Exception{
		throw new Exception("m3¿¹¿Ü");
	}
}

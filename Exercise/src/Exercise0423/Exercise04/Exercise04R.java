package Exercise0423.Exercise04;

public class Exercise04R {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;

		int pencilsStudent = pencils/students;//정수/정수->정수 (몫)
		int pencilsLeft = pencils%students;//정수%정수->정수 (나머지)

		System.out.println("한 학생당: "+pencilsStudent+"개");
		System.out.println("나머지:"+pencilsLeft+"개");
	}
}

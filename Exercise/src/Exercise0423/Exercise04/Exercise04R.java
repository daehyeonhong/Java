package Exercise0423.Exercise04;

public class Exercise04R {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;

		int pencilsStudent = pencils/students;//����/����->���� (��)
		int pencilsLeft = pencils%students;//����%����->���� (������)

		System.out.println("�� �л���: "+pencilsStudent+"��");
		System.out.println("������:"+pencilsLeft+"��");
	}
}

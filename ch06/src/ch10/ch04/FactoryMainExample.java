package ch10.ch04;

public class FactoryMainExample {
	static int seq = 0;

	public static void main(String[] args) {
		School sc = new School();
		Student s1 = sc.getStudent(++seq, "홍길동");
		Student s2 = sc.getStudent(++seq, "일지매");
		Student s3 = sc.getStudent(++seq, "임꺽정");

		System.out.println(s1);// toString() 메소드 특징: 참조 변수가 println()의 매개 변수로 사용 되면 자동 호출
		System.out.println(s2.toString());
		System.out.println(s3);
	}
}
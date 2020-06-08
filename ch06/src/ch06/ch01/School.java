package ch06.ch01;

public class School {
	// 1번, "홍길동", 80,75,90을 입력받고
	// Student 객체를 리턴할 수 있도록 메소드를 선언
	Student getStudent(int sno, String name, int kor, int math, int eng) {
		return new Student(sno, name, kor, math, eng);
	}

	// 위에서 생성한 Student 객체의 국어(kor),수학(math),영어(eng)
	// 점수의 합과 평균을 구하여 리턴하지 않고 출력하는 메소드 선언
	void scoreInfo(Student student) {
		int sum = student.getKor() + student.getMath() + student.getEng();
		double avg = Math.round(sum / 3);
		System.out.println("국어 영어 수학 점수의 합: " + sum + "\n평균" + avg);
	}
}
package ch10.ch04;

//Factory ���
public class School {
	private Student student;

	Student getStudent(int sno, String name) {
		student = new Student(sno, name);
		return student;
	}
}
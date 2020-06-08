package ch06.ch01;

public class SchoolMainExample {
	public static void main(String[] args) {
		School school = new School();

		Student student = school.getStudent(150, "±è°³¶Ë", 60, 70, 2);
		school.scoreInfo(student);
	}
}
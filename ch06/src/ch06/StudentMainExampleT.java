package ch06;

public class StudentMainExampleT {
	public static void main(String[] args) {
		Student student = new Student();
		Person person = student.getPerson("ȫ�浿", 'M', 16);
		System.out.println(person.name + "," + person.gender + "," + person.age);
	}
}
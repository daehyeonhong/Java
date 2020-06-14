package Exercise0612.Exercise003;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return this.studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (studentNum.equals(student.studentNum)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Student student1 = new Student("5050");
		Student student2 = new Student("5050");
		Student student3 = new Student("5010");

		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());

		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student3));
	}
}
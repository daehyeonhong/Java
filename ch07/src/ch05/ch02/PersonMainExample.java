package ch05.ch02;

public class PersonMainExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동");
		System.out.println("1." + student.name);
		student.grade = "A";
		System.out.println(student.grade);

		// 부모 타입으로 대입(promotion)
		Person person = student;
		System.out.println("2." + person.name);
		// 부모 타입으로 promotion된 객체는 자식 타입 클래스에서 추가된 멤버는 접근 불가
		// System.out.println(person.grade);
		// person.getGrade();
		// 재정의된 메소드 실행

		System.out.println("3:" + person.getName());
		Student s = (Student) person;
		// 다시 원래 타입으로 환원(casting)되면 추가된 자식 클래스 멤버에 접긍 가능
		System.out.println("4." + s.grade);
		System.out.print("5. ");
		s.getGrade();
		System.out.println("6." + s.getName());
	}
}
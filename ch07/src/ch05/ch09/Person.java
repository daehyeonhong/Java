package ch05.ch09;

public class Person {
	public static void main(String[] args) {
		Person jee = new Student();
		Person kim = new Professor();
		Person lee = new Researcher();

		System.out.println(jee instanceof Person);
		System.out.println(jee instanceof Student);
		System.out.println(kim instanceof Professor);
		System.out.println(kim instanceof Student);
		System.out.println(lee instanceof Professor);

		System.out.println("java" instanceof String);
		System.out.print("new Student()->\t");
		print(new Student());

		System.out.print("new Resarcher()->\t");
		print(new Researcher());

		System.out.print("new Professor()->\t");
		print(new Professor());
	}

	static void print(Person p) {
		if (p instanceof Person) {
			System.out.println("Person");
		}
		if (p instanceof Student) {
			System.out.println("Student");
		}
		if (p instanceof Researcher) {
			System.out.println("Researcher");
		}
		if (p instanceof Professor) {
			System.out.println("Professor");
		}
		System.out.println("---------------------------------------");
	}
}

class Student extends Person {

}

class Researcher extends Person {

}

class Professor extends Researcher {

}
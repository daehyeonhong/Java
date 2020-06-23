package ch02;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("홍길동", 10), new Student("일지매", 20),
				new Student("임꺽정", 30));

		// Collection으로부터 Stream 얻기(내부 반복자) 직/병렬
		System.out.println("내부 반복자:직렬");
		Stream<Student> stream = studentList.stream();
		stream.forEach(t -> System.out.println(t.getName()));

		System.out.println("내부 반복자:병렬");
		stream = studentList.parallelStream();
		stream.forEach(t -> System.out.println(t.getName()));

		// 외부 반복자
		System.out.println("외부 반복자");
		Iterator<Student> iterator = studentList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}
}

class Student {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
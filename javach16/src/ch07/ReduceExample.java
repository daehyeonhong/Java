package ch07;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("홍길동", 92), new Student("일지매", 95),
				new Student("임꺽정", 88));

		Stream<Student> studentStream = studentList.stream();
		IntStream intStream = studentStream.mapToInt(value -> value.getScore());
		int sum1 = intStream.sum();
		System.out.println("학생들 점수의 총합_1: " + sum1);

		Stream<Student> studentStream1 = studentList.stream();
		Stream<Integer> studentStream2 = studentStream1.map(Student::getScore);
		Optional<Integer> optionalInt = studentStream2.reduce((t, u) -> t + u);

		int sum2 = optionalInt.get();
		System.out.println("학생들 점수의 총합_2: " + sum2);

		Stream<Student> studentStream3 = studentList.stream();
		Stream<Integer> intStream3 = studentStream3.map(Student::getScore);

		int sum3 = intStream3.reduce(0, (t, u) -> t + u);
		System.out.println("학생들 점수의 총합_3: " + sum3);
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

	public int getScore() {
		return score;
	}
}
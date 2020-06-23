package ch01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 90), new Student("일지매", 92), new Student("임꺽정", 88));
		// 내부 반복자 Stream 얻기
		Stream<Student> stream = list.stream();
		stream.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				String name = t.getName();
				int score = t.getScore();
				System.out.println(name + " - " + score);
			}
		});

		stream = list.stream();
		stream.forEach(t -> {
			String name = t.getName();
			int score = t.getScore();
			System.out.println(name + " - " + score);
		});
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
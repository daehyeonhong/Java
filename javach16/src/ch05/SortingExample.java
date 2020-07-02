package ch05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortingExample {
	public static void main(String[] args) {
		/* 숫자 */
		IntStream intStream = Arrays.stream(new int[] { 5, 3, 2, 1, 4 });
		IntStream stream = intStream.sorted();
		stream.forEach(v -> System.out.println(v));
		System.out.println();

		/* 체인 */
		intStream = Arrays.stream(new int[] { 5, 3, 2, 1, 4 });
		intStream.sorted().forEach(v -> System.out.println(v));
		System.out.println();

		/* 객체 요소 */
		List<Student> studentList = Arrays.asList(new Student("홍길동", 30), new Student("일지매", 10),
				new Student("임꺽정", 20));

		Stream<Student> studentStream = studentList.stream();
		studentStream = studentStream.sorted();
		studentStream.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				System.out.println(t.getName() + ": " + t.getScore());
			}
		});
		System.out.println();

		studentList.stream().sorted().forEach(t -> System.out.println(t.getName() + ": " + t.getScore()));
	}
}
package ch05;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("홍길동", 10), new Student("일지매", 20),
				new Student("임꺽정", 30));

		/* list로부터 Stream 얻기 */
		Stream<Student> sStream = studentList.stream();

		/* 객체 -> int로 변환한 결과를 스트림으로 얻기 */
		IntStream scores = sStream.mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student student) {
				return student.getScore();
			}
		});

		/* 출력 */
		scores.forEach(new IntConsumer() {
			@Override
			public void accept(int score) {
				System.out.println(score);
			}
		});
	}
}

class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.score, o.score);/* 자신이 낮은 점수면 -, 자신이 높으면 +, 서로 같으면 0 */
	}
}
package ch05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExamplechainning {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("홍길동", 10), new Student("일지매", 20),
				new Student("임꺽정", 30));

		/* list로부터 Stream 얻기 */
		Stream<Student> sStream = studentList.stream();

		/* 객체 -> int로 변환한 결과를 스트림으로 얻기 */
		IntStream scores = sStream.mapToInt(student -> student.getScore());

		/* 출력 */
		scores.forEach(score -> System.out.println(score));
		System.out.println();
		
		/* list로 부터 Stream 얻기 */
		studentList.stream().mapToInt(v -> v.getScore()).forEach(v -> System.out.println(v));
	}
}
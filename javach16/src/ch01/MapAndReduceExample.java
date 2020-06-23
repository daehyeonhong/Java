package ch01;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("홍길동", 10), new Student("신용권", 20),
				new Student("유미선", 30));

		// Method_Chaining
		double avg = studentList.stream().mapToInt(v -> v.getScore()).average()
				/* 평균 산출_Method[중간 산출] */.getAsDouble();/* 최종 산출 */
		System.out.println("평균 점수: " + avg);
	}
}
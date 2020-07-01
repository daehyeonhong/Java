package ch04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "홍길동", "홍길동", "일지매", "홍길동", "임꺽정", "홍길동", "일지매", "홍길동", "김길동");
		Stream<String> stream = names.stream();
		Stream<String> stream1 = stream.distinct();
		stream1.forEach(t -> System.out.println(t));

		stream = names.stream();
		Stream<String> stream2 = stream.filter(t -> t.startsWith("홍"));

		System.out.println();
		stream2.forEach(t -> System.out.println(t));

		System.out.println();
		stream = names.stream();
		stream.distinct().filter(t -> t.startsWith("홍")).forEach(t -> System.out.println(t));
	}
}
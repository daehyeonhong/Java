package ch01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "김자바", "람다식", "박병렬");
		// 순차 처리
		Stream<String> stream = list.stream();
		stream.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				// System.out.println(t);
				print(t);
			}
		});
		stream = list.stream();
		stream.forEach(t -> /* System.out.println(t) */print(t));

		// 병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				// System.out.println(t);
				print(t);
			}
		});

		parallelStream = list.parallelStream();
		parallelStream.forEach(t -> print(t));
	}

	public static void print(String str) {
		System.out.println(str + ":" + Thread.currentThread().getName());
	}
}
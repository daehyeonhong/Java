package ch05;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };

		/* int 타입의 배열로 IntStream생성 Arrays.stream(Arr) */
		IntStream intStream = Arrays.stream(intArray);

		/* double로 전환 */
		DoubleStream doubleStream = intStream.asDoubleStream();
		doubleStream.forEach(new DoubleConsumer() {
			@Override
			public void accept(double value) {
				System.out.println(value);
			}
		});

		/* Boxing */
		intStream = Arrays.stream(intArray);
		Stream<Integer> boxStream = intStream.boxed();/* Integer_Boxing */
		boxStream.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);/* AutoUnboxing */
			}
		});
	}
}
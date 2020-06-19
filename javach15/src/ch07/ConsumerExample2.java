package ch07;

import java.util.function.Consumer;

public class ConsumerExample2 {
	public static void main(String[] args) {
		Consumer<Member> consumerA = t -> System.out.println(t.getName());
		Consumer<Member> consumerB = t -> System.out.println(t.getId());

		// A andThen B
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
	}
}
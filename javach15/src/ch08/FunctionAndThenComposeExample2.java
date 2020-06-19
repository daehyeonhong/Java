package ch08;

import java.util.function.Function;

public class FunctionAndThenComposeExample2 {
	public static void main(String[] args) {
		// Function 함수적 인터페이스
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;

		functionA = t -> t.getAddress();
		functionB = t -> t.getCity();

		// A andThen B
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("대한민국", "서울")));
		System.out.println("거주도시: " + city);

		// B compose A
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("대한민국", "서울")));
		System.out.println("거주도시: " + city);
	}
}
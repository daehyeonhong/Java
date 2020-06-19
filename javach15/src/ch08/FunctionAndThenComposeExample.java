package ch08;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
		// Function 함수적 인터페이스
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;

		functionA = new Function<Member, Address>() {

			@Override
			public Address apply(Member t) {
				return t.getAddress();
			}
		};

		functionB = new Function<Address, String>() {

			@Override
			public String apply(Address t) {
				return t.getCity();
			}
		};

		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("대한민국", "서울")));
		System.out.println("거주도시: " + city);

		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("대한민국", "서울")));
		System.out.println("거주도시: " + city);
	}
}
package ch11;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = new Function<String, Member>() {
			@Override
			public Member apply(String t) {
				return new Member(t);
			}
		};
		Member member1 = function1.apply("Hong");
		System.out.println(member1.getId());

		// Lambda
		Function<String, Member> function2 = t -> new Member(t);
		Member member2 = function2.apply("kang");
		System.out.println(member2.getId());

		// 생성자 참조
		function1 = Member::new;
		member1 = function1.apply("hwang");
		System.out.println(member1.getId());

		BiFunction<String, String, Member> function3 = (t, u) -> new Member(t, u);
		Member member3 = function3.apply("홍길동", "hong");
		System.out.println(member3.getId());

		function3 = Member::new;
		member3 = function3.apply("3번 함수", "33");
		System.out.println(member3.getId());

	}
}
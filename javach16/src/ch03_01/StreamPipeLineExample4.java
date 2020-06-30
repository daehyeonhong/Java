package ch03_01;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample4 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("홍길동", Member.MALE, 30), new Member("일지매", Member.FEMALE, 20),
				new Member("임꺽정", Member.MALE, 45), new Member("김길동", Member.FEMALE, 27));

		// 내부 반복자를 이용한 처리
		double avg = list.stream().filter(member -> member.getGender() == Member.MALE)
				.mapToInt(member -> member.getAge()).average().getAsDouble();
		System.out.println("평균: " + avg);
	}
}
package ch03_01;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("홍길동", Member.MALE, 30), new Member("일지매", Member.FEMALE, 20),
				new Member("임꺽정", Member.MALE, 45), new Member("김길동", Member.FEMALE, 27));
		double sum = 0;
		int count = 0;

		// 외부 반복자
		for (Member member : list) {
			sum += (member.getGender() == Member.MALE ? member.getAge() : 0);
			if (member.getGender() == Member.MALE) {
				count++;
			}
		}

		double ageAvg = sum / count;
		System.out.println(ageAvg);
	}
}
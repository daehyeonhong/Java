package ch06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
	private static List<Dept> list = Arrays.asList(new Dept("영업1", "영업부", 50000), new Dept("기획1", "기획부", 90000),
			new Dept("영업2", "영업부", 30000), new Dept("연구1", "지원부", 20000));

	// method 선언
	public static double avg(Predicate<Dept> predicate) {
		int count = 0, sum = 0;
		for (Dept dept : list) {
			if (predicate.test(dept)) {
				count++;
				sum += dept.total;
			}
		}
		return sum / count;
	}

	public static void main(String[] args) {
		double saleAvg = avg(t -> t.getPart().equals("영업부"));
		System.out.println("영업부 평균매출: " + saleAvg);

	}
}

class Dept {
	String dname;
	String part;
	long total;

	public Dept(String dname, String part, long total) {
		this.dname = dname;
		this.part = part;
		this.total = total;
	}

	public String getDname() {
		return dname;
	}

	public String getPart() {
		return part;
	}

	public long getTotal() {
		return total;
	}
}

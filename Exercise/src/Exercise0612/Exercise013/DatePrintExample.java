package Exercise0612.Exercise013;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();

		// 여기서 코드를 작성하세요
		now.setYear(124);
		now.setMonth(4);
		now.setDate(8);
		now.setHours(10);
		now.setMinutes(30);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		System.out.println(sdf.format(now));
	}
}
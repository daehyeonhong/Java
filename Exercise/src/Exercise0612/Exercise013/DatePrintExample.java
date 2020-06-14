package Exercise0612.Exercise013;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();

		// 여기서 코드를 작성하세요
		java.sql.Date nowDate = new java.sql.Date(System.currentTimeMillis());
		now = nowDate;
		LocalDateTime target = nowDate.toLocalDate();
		target = target.withYear(2024).withMonth(5).withDayOfMonth(8).withHour(10).withMinute(30);
		System.out.println(target);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		System.out.println(sdf.format(now));
	}
}
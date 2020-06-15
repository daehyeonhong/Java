package Exercise0612.Exercise013;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex13MainExample {
	public static void main(String[] args) {
		Date now = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 h시 m분");

		String strDate = sdf.format(now);

		System.out.println(strDate);

		// sql 데이터 생성
		java.sql.Date sDate = new java.sql.Date(new Date().getTime());
		System.out.println(sDate);
	}
}
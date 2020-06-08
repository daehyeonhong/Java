package ch10.ch04.ch01;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBService {
	// 필드 - private static
	private static DBService istance = new DBService();

	// Default 생성자 - private
	private DBService() {

	}

	// 외부에서 접근 가능한 메소드 getInstance() public으로 선언
	public static DBService getIstance() {
		return istance;
	}

	public Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "tiger");
		return con;
	}

}
package ch10.ch04.ch01;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBService {
	// �ʵ� - private static
	private static DBService istance = new DBService();

	// Default ������ - private
	private DBService() {

	}

	// �ܺο��� ���� ������ �޼ҵ� getInstance() public���� ����
	public static DBService getIstance() {
		return istance;
	}

	public Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "tiger");
		return con;
	}

}
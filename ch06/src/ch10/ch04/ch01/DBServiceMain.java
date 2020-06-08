package ch10.ch04.ch01;

import java.sql.Connection;

public class DBServiceMain {
	
	public static void main(String[] args) {
		// singleton ��ü ���
		DBService dbService = DBService.getIstance();
		try {
			// db ���� �α�
			Connection con = dbService.getConnection();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
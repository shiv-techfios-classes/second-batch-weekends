package practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUpdates {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		String jdbcURL = "jdbc:mysql://localhost:3306/javaqa?useSSL=false";
		
		String user = "root";
		
		String key = "root";
		
		final String DELETE_USERS_SQL = "delete from users where id = ?;";
		final String UPDATE_USERS_SQL = "update users set name = ?, department=? where id = ?;";
		
		
		try {
			
			conn = DriverManager.getConnection(jdbcURL, user, key);
			
			PreparedStatement ps = conn.prepareStatement(UPDATE_USERS_SQL);
			
			ps.setString(1, "Mohan Singh");
			ps.setString(2, "QA Automation");
			ps.setInt(3, 1);
			
			ps.executeUpdate();
			
			System.out.println("Update successful.");
			
			ps = conn.prepareStatement(DELETE_USERS_SQL);
			
			ps.setInt(1, 4);
			
			ps.executeUpdate();
			
			System.out.println("delete successful.");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("- - - - - - Connected to mysql DB");

	}

}

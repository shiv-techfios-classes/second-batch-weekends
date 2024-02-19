package practice.jdbc;

import java.sql.*;

public class DBConnect {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		String jdbcURL = "jdbc:mysql://localhost:3306/javaqa?useSSL=false";
		
		String user = "root";
		
		String key = "root";
		
		String select_all = "select * from users";
		
		String select_by_user_id = "select * from users where id=?";
		
		String select_by_name = "SELECT * FROM users WHERE name like CONCAT( '%',?,'%')";
		
		String select_by_department = "SELECT * FROM users WHERE department like CONCAT( '%',?,'%')";
		
		final String DELETE_USERS_SQL = "delete from users where id = ?;";
		final String UPDATE_USERS_SQL = "update users set name = ?, department=? where id = ?;";

		
		try {
	
			conn = DriverManager.getConnection(jdbcURL, user, key);
			
			System.out.println("- - - - - - Connected to mysql DB");
			
			Statement stmt = conn.createStatement();
			
			ResultSet resultSet = stmt.executeQuery(select_all);
			
			System.out.println("(ID)\t(Name)\t(Department)");
			
			while(resultSet.next()) {
				
				int id = resultSet.getInt(1);
				String name =  resultSet.getString(2);
				String dept = resultSet.getString(3);
				System.out.println(id + "\t"+ name+ "\t"+ dept);
			}
			
			System.out.println("- - - -  - Meta Data- - - - ");
			
			ResultSet metaResults = stmt.executeQuery("show tables");
			
			DatabaseMetaData metaData =  conn.getMetaData();
			
			System.out.println("Database Product Name:" + metaData.getDatabaseProductName());
			
			System.out.println("Database Product Version:" + metaData.getDatabaseProductVersion());
			
			
			while(metaResults.next()) {
				
				System.out.println(metaResults.getString(1));
			}
			
			
			PreparedStatement pstmt = conn.prepareStatement(select_by_user_id);
			
			pstmt.setInt(1, 3);
			
			ResultSet single_user = pstmt.executeQuery();
			
			
			while(single_user.next()) {
				System.out.println("- - - - - - - - "+single_user.getString(2) +"," + single_user.getString(3));
			}

			pstmt =  conn.prepareStatement(select_by_department);
			
			pstmt.setString(1,  "admin");
			
			ResultSet users_by_department = pstmt.executeQuery();
			
			
			while(users_by_department.next()) {
				System.out.println("- - - by department admin- - - - - "+users_by_department.getString(1) +"," + users_by_department.getString(2));
			}
			
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			
			try {
				if(conn !=null && !conn.isClosed())
					conn.close();
				System.out.println("Closing the MYSQL DB connection after performing all tasks.");
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}

	}

}

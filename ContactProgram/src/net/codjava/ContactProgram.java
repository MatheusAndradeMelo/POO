package net.codjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactProgram {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:postgresql://localhost:1234/shopme";
		String username = "postgres";
		String password = "1234";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcURL,username,password);
			System.out.println("Connected to PostgreSQL server");
			
			String sql = "INSERT INTO contacts (first_name, last_name, email)"+
						" VALUES ( 'Matheus', 'Andrade', 'matheusandrade2021@gmail.com')";
			
			Statement statement = connection.createStatement();
			
			int rows = statement.executeUpdate(sql);
			if (rows > 0) {
				System.out.println("A new contact has been inserted.");
			}
			
			connection.close();
			
		} catch (SQLException e) {
			System.out.println("ERROR in connecting to PostgreSQL server");
			e.printStackTrace();
		}

	}

}

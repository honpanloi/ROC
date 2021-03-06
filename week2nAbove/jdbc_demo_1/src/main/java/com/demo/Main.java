package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			//Step 1 - load driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded successfully");
			//step 2 - open connection(url, username, password)
			String url ="jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "951753";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected successfully");
			//step 3 - create statement
			Statement statement = connection.createStatement();
			String sql = "select * from test1222.player";
			//step 4 - Execute Query
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query execute");
			//step 5 - Process results
			while(resultSet.next()) {
				System.out.print("player_id = " + resultSet.getInt("player_id"));
				System.out.println();
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//step 6 close connection
				connection.close();
				System.out.println("\nConnection closed");
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}

	}

}

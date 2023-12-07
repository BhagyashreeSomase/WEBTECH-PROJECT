package com.jspiders.jdbcstatic.delete;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Delete {

		private static Connection connection;
		private static Statement statement;
		private static int result;
		private static FileReader fileReader;
		private static Properties properties;
		private static String query;
		private static String filePath ="C:\\Users\\HP\\Desktop\\weja1\\jdbcstatic\\resources\\db_info.properties";	
				
		public static void main(String[] args) {
			
			try {
				
				fileReader = new FileReader(filePath);
				properties = new Properties();
				properties.load(fileReader);
				
				Class.forName(properties.getProperty("driverPath"));
				
				connection = DriverManager.getConnection
						(properties.getProperty("dburl"), properties);
				
				statement = connection.createStatement();
				Scanner sc = new Scanner(System.in);
				query = "delete from employee"
						+ "where Empno = "+ sc.nextInt() + "";
				result = statement.executeUpdate(query);
				
				System.out.println
				("Query OK, " + result + " row(s) affected");
				
			} catch (IOException | ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
					if (statement != null) {
						statement.close();
					}
					if (fileReader != null) {
						fileReader.close();
					}
				} catch (SQLException | IOException e) {
					e.printStackTrace();
				}
			}
		}

	}


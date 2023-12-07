package com.jspiders.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectDemo2 {
public static void main(String[]args) {
	try {
		//1.load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.open connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja1","root","root");
		//3.create statement
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select*from employee");
		//4.process the result
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+"//"
			+resultSet.getString(2)+"//"
			+resultSet.getString(3)+"//"
			+resultSet.getString(4));
		}
		//5.close connection
		connection.close();
		statement.close();
		resultSet.close();
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
		
	}

}
}

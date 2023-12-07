package jdbc_mavenproject_wejm5;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PersonCRUD {
	public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		FileInputStream fileInputStream=new FileInputStream("dbconfig.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		
		Class.forName(properties.getProperty("className"));
		Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));
		return connection;
	
	}
public void savePerson(int id,String name,long phone) throws ClassNotFoundException,IOException,SQLException {
	Connection connection=getConnection();
	PreparedStatement prepareStatement=connection.prepareStatement("INSERT INTO PERSON");
	prepareStatement.setInt(1,id);
	prepareStatement.setString(2,name);
	prepareStatement.setLong(3,phone);
	int count=prepareStatement.executeUpdate();
	if (count==1) {
		System.out.println("Inserted");
	} else {
		System.out.println("Not inserted");
	}
	connection.close();
}



}

package jdbc_mavenproject_wejm5.main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc_mavenproject_wejm5.PersonCRUD;

public class PropertyMain {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the id");
	int id=scanner.nextInt();
	System.out.println("Enter the name");
	String name=scanner.next();
	System.out.println("Enter the phone");
	long phone=scanner.nextLong();
	
	PersonCRUD crud=new PersonCRUD();
	try {
		crud.savePerson(id,name,phone);
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
}

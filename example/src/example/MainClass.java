package example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException , SQLException {

		do {
		Scanner sc = new Scanner(System.in);
		OperationClass object=new OperationClass();
		System.out.println("Enter 1 to insert a record");
		System.out.println("Enter 2 to delete a record");
		System.out.println("Enter 3 to update a record");
		System.out.println("Enter 4 to display one record");
		System.out.println("Enter 5 to display all records");
		int reply = sc.nextInt();
		switch (reply) {
		
		case 1:
			object.insert_record();
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid input");
		}}while(true);
		
        }
}

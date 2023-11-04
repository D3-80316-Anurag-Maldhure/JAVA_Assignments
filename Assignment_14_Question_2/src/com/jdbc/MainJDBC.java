package com.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MainJDBC {

	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/JDBC";
	public static final String DB_USER = "D3_80316_Anurag";
	public static final String DB_PASSWORD = "80316";

	static {
		try {
			Class.forName(DB_DRIVER);
		}catch (Exception e){
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args){

		int choice =0;
		Scanner sc = new Scanner(System.in);

		try(Connection connnection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){

			do {
				System.out.println("----------------------------------------------------------------------------------\n"
						+ "Please select a option :\n"
						+ "0. EXIT\n"
						+ "1. Insert new user (Voter)\n"
						+ "2. Display all users\n"
						+ "3. Delete voter with given id\n"
						+ "4. Change status of voter with given id to true\n"
						+ "5. Change the name and birth date of voter\n"
						+ "Please enter your choice: ");

				choice = sc.nextInt();

				switch(choice) {
				//EXIT
				case 0:
					System.out.println("-----------------------------");
					System.out.println("Thank you for using our app !");
					break;
					//Insert new user (Voter)
				case 1:				
					System.out.println("-----------------------------------------");
					String query1 = "INSERT INTO users VALUES(default, ?, ?, ?, ?, ?, ?, ?)"; // parameterized query

					try(PreparedStatement stmt = connnection.prepareStatement(query1)){
						System.out.print("Enter first name: ");
						String firstName = sc.next();
						System.out.print("Enter last name: ");
						String lastName = sc.next();
						System.out.print("Enter email: ");
						String email = sc.next();
						System.out.print("Enter password: ");
						String password = sc.next();
						System.out.print("Enter dob: ");
						
						//String -> utilDate -> SQL Date
						String dateStr = sc.next();
						SimpleDateFormat sdf;
						sdf = new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date uDate = sdf.parse(dateStr);
						java.sql.Date sDate;
						sDate = new java.sql.Date(uDate.getTime());
						
						System.out.print("Enter status: ");
						int status = sc.nextInt();
						System.out.print("Enter role: ");
						String role = sc.next();
						
						stmt.setString(1, firstName);
						stmt.setString(2, lastName);
						stmt.setString(3, email);
						stmt.setString(4, password);
						stmt.setDate(5, sDate);
						stmt.setInt(6, status);
						stmt.setString(7, role);

						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: " + count);
					} // stmt.close(); 
					break;
				//Display all users
				case 2:
					System.out.println("-----------------------------------------");
					String query2 = "SELECT * FROM users"; // parameterized query

					try(PreparedStatement stmt = connnection.prepareStatement(query2)){
						System.out.print("List of all candidates in DB :\n");
						try(ResultSet rs = stmt.executeQuery(query2)) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String firstName = rs.getString("first_name");
								String lastName = rs.getString("last_name");
								String email = rs.getString("email");
								String password = rs.getString("password");
								//SQL Date -> utilDate  -> String
								Date sDate = rs.getDate("dob");
								SimpleDateFormat sdf;
								sdf = new SimpleDateFormat("dd-MM-yyyy");
								String dateStr = sdf.format(sDate);
								
								int status = rs.getInt("status");
								String role = rs.getString("role");
								System.out.printf("%d, %s, %s, %s, %s, %s %d %s\n", id, firstName, lastName, email, password, dateStr, status, role);
							}
						} // rs.close();
					} // stmt.close(); 
					break;
					//Delete voter with given id
				case 3:
					System.out.println("----------------------------------------------");
					System.out.println("Enter the id of the voter you want to delete : ");
					int id = sc.nextInt();

					String query3 = "DELETE FROM users WHERE id = ?"; // parameterized query

					try(PreparedStatement stmt = connnection.prepareStatement(query3)){
						stmt.setInt(1,id);

						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: " + count);
					} // stmt.close(); 
					break;
				//Change status of voter with given id to true 
				case 4:
					System.out.println("---------------------------------------------------------");
					System.out.println("Enter the id of the voter you want to change status of : ");
					id = sc.nextInt();

					String query4 = "UPDATE users SET status = 1 WHERE id = ?"; // parameterized query

					try(PreparedStatement stmt = connnection.prepareStatement(query4)){
						stmt.setInt(1,id);

						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: " + count);
					} // stmt.close(); 
					break;
					// Change the name and birth date of voter
				case 5:
					System.out.println("----------------------------------------------------------");
					System.out.println("Enter the id of the user you want to change details of : ");
					id = sc.nextInt();
					System.out.println("Enter the new first name of the voter : ");
					String newFirstName = sc.next();
					System.out.println("Enter the new last name of the voter : ");
					String newLastName = sc.next();
					System.out.println("Enter the new birth date of the voter : ");
					String newDOB = sc.next();

					String query5 = "UPDATE users SET first_name = ?, last_name = ?, dob = ? WHERE id = ?"; // parameterized query

					try(PreparedStatement stmt = connnection.prepareStatement(query5)){
						stmt.setString(1,newFirstName);
						stmt.setString(2,newLastName);
						
						//String -> utilDate -> SQL Date
						SimpleDateFormat sdf;
						sdf = new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date utilDate = sdf.parse(newDOB);
						java.sql.Date sqlDate;
						sqlDate = new java.sql.Date(utilDate.getTime());
						
						stmt.setDate(3,sqlDate);
						stmt.setInt(4,id);

						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: " + count);
					} // stmt.close(); 
					break;
					
				default:
					System.out.println("-----------------------------");
					System.out.println("INVALID CHOICE! Please enter a valid choice from above menu.");
					break;
				}
			}
			while(choice!=0);
		}							// connnection.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

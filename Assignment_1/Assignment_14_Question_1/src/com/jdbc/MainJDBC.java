package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
						+ "1. Insert new candidate\n"
						+ "2. Display all candidates\n"
						+ "3. Increment votes of candidate with given id\n"
						+ "4. Delete candidate with given id\n"
						+ "5. Find candidate of given id\n"
						+ "6. Find candidates of given party\n"
						+ "7. Display total votes for each party\n"
						+ "Please enter your choice: ");

				choice = sc.nextInt();

				switch(choice) {
				//EXIT
				case 0:
					System.out.println("-----------------------------");
					System.out.println("Thank you for using our app !");
					break;
					//Insert new candidate
				case 1:
					System.out.println("-----------------------------------------");
					String query1 = "INSERT INTO candidates VALUES(default, ?, ?, ?)"; // parameterized query

					try(PreparedStatement stmt = connnection.prepareStatement(query1)){
						System.out.print("Enter Name: ");
						String name = sc.next();
						System.out.print("Enter Party: ");
						String party = sc.next();
						System.out.print("Enter Votes: ");
						int votes = sc.nextInt();

						stmt.setString(1, name);
						stmt.setString(2, party);
						stmt.setInt(3, votes);

						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: " + count);
					} // stmt.close(); 
					break;
					//Display all candidates
				case 2:
					System.out.println("-----------------------------------------");
					String query2 = "SELECT * FROM candidates"; // parameterized query

					try(PreparedStatement stmt = connnection.prepareStatement(query2)){
						System.out.print("List of all candidates in DB :\n");
						try(ResultSet rs = stmt.executeQuery(query2)) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
							}
						} // rs.close();
					} // stmt.close(); 
					break;
					//Increment votes of candidate with given id
				case 3:
					System.out.println("-----------------------------------------");
					System.out.println("Enter the id of the candidate : ");
					int id = sc.nextInt();
												
					String query3 = "UPDATE candidates SET votes = votes+1 where id =?"; // parameterized query
												
					try(PreparedStatement stmt = connnection.prepareStatement(query3)){							
						stmt.setInt(1, id);
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: " + count);
					} // stmt.close(); 

					break;
					//Delete candidate with given id
				case 4:
					System.out.println("---------------------------------------------------");
					System.out.println("Enter the id of the candidate you want to delete : ");
					id = sc.nextInt();

					String query4 = "DELETE FROM candidates WHERE id = ?"; // parameterized query

					try(PreparedStatement stmt = connnection.prepareStatement(query4)){
						stmt.setInt(1,id);

						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: " + count);
					} // stmt.close(); 
					break;
					// Find candidate of given id
				case 5:
					System.out.println("-------------------------------------------------");
					System.out.println("Enter the id of the candidate you want to find : ");
					id = sc.nextInt();

					String query5 = "SELECT * FROM candidates WHERE id=?"; // parameterized query

					try(PreparedStatement stmt = connnection.prepareStatement(query5)){
						stmt.setInt(1,id);

						System.out.print("Candidate found :\n");
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								int ide = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", ide, name, party, votes);
							}
						} // rs.close();
					} // stmt.close(); 
					break;
					//Find candidates of given party
				case 6:
					System.out.println("----------------------------------------------------------------");
					System.out.println("Enter the name of the party whose candidates you want to find : ");
					String partyName = sc.next();

					String query6 = "SELECT * FROM candidates WHERE party=?"; // parameterized query

					try(PreparedStatement stmt = connnection.prepareStatement(query6)){
						stmt.setString(1, partyName);

						System.out.print("Candidate found :\n");
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								int ide = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", ide, name, party, votes);
							}
						} // rs.close();

					} // stmt.close(); 

					break;
					//Display total votes for each party
				case 7:
					System.out.println("-----------------------------");
					System.out.println("Total votes for each party :");

					String query7 = "SELECT sum(votes) as \"Total Votes\", party FROM candidates GROUP BY party"; // parameterized query

					try(PreparedStatement stmt = connnection.prepareStatement(query7)){
						try(ResultSet rs = stmt.executeQuery(query7)) {
							while(rs.next()) {
								int votes = rs.getInt("Total Votes");
								String party = rs.getString("party");
								System.out.printf("%d, %s\n",votes, party);
							}
						} // rs.close();

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

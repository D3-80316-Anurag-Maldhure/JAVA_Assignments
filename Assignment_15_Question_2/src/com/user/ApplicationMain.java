package com.user;

import java.lang.invoke.StringConcatFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ApplicationMain {
	

	public static void main(String[] args) {
		//TODO: Menu driven program
		
		int choice =0;
		Scanner sc = new Scanner(System.in);

			do {
				System.out.println("----------------------------------------------------------------------------------\n"
						+ "Please select a option :\n"
						+ "0. EXIT\n"
						+ "1. Add a new user\n" 
						+ "2. Update an existing user\n" 
						+ "3. Delete user with given id\n" 
						+ "4. Find user of given id\n" // *
						+ "5. Find all users\n" 
						+ "Please enter your choice: ");

				choice = sc.nextInt();

				switch(choice) {
				
				//EXIT
				case 0:
					System.out.println("-----------------------------");
					System.out.println("Thank you for using our app !");
					break;
					//Add a new User - save
				case 1:
					System.out.println("-----------------------------------------");
					try(UserDao dao = new UserDao()) {
						User userToAdd = acceptUser(sc);
						int count = dao.save(userToAdd);
						System.out.println("Rows Updated: " + count);
						System.out.println("Candidate added successfully! ");
					} // dao.close();
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
					//Candidate update 
				case 2:
					try(UserDao dao = new UserDao()){
						User u = updateUser(sc);
						int count = dao.update(u);
						System.out.println("Rows Updated: " + count);
						System.out.println("User updated successfully! ");
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
					//Delete user with given id
				case 3:
					System.out.println("---------------------------------------------------");
					try(UserDao dao = new UserDao()) {
						System.out.print("Enter id: ");
						int id = sc.nextInt();
						int rowCount = dao.deleteById(id);
						System.out.println("Rows Deleted: " + rowCount);
						System.out.println("User deleted successfully");
					} // dao.close();
					catch (Exception e) {
						e.printStackTrace();
					}

					break;
					// Find user of given id 
				case 4:
					System.out.println("-----------------------------------------");
					try(UserDao dao = new UserDao()) {
						System.out.print("Enter id: ");
						int id = sc.nextInt();
						User FoundUser  = new User();
						FoundUser = dao.findById(id);
						System.out.println(FoundUser);
					} // dao.close();
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
					//Find all 
				case 5:
					System.out.println("----------------------------------------------------------------");
					try(UserDao dao = new UserDao()) {
						List<User> list = dao.findAll();
						list.forEach(c -> System.out.println(c));
					} // dao.close();
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
				default:
					System.out.println("-----------------------------");
					System.out.println("INVALID CHOICE! Please enter a valid choice from above menu.");
					break;
				}
			}
			while(choice!=0);
		}
	
	public static User acceptUser(Scanner sc) throws ParseException {
		int ide = 0;
		System.out.print("Enter first name : ");
		String fname = sc.next();
		System.out.print("Enter last name : ");
		String lname = sc.next();
		System.out.print("Enter email: ");
		String email = sc.next();
		System.out.print("Enter password: ");
		String password = sc.next();
		System.out.print("Enter date (dd-mm-yyyy format): ");
		String dateString = sc.next();
		java.util.Date udate;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		udate = simpleDateFormat.parse(dateString);
		System.out.print("Enter status: ");
		int status = sc.nextInt();
		System.out.print("Enter role: ");
		String role = sc.next();
		User userToAdd = new User(ide, fname, lname, email, password, udate, status, role);	
		return userToAdd;
		
	}
	
	public static User updateUser(Scanner sc) throws ParseException {
		System.out.print("Enter the id of the candidate you want to Update: ");
		int idx = sc.nextInt();
		System.out.print("Enter new first name : ");
		String fname = sc.next();
		System.out.print("Enter new last name : ");
		String lname = sc.next();
		System.out.print("Enter new email: ");
		String email = sc.next();
		System.out.print("Enter new password: ");
		String password = sc.next();
		System.out.print("Enter new date (dd-mm-yyyy format): ");
		String dateString = sc.next();
		java.util.Date udate;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		udate = simpleDateFormat.parse(dateString);
		System.out.print("Enter new status: ");
		int status = sc.nextInt();
		System.out.print("Enter new role: ");
		String role = sc.next();
		User updateUser = new User(idx, fname, lname, email, password, udate, status, role);	
		return updateUser;
	}
}

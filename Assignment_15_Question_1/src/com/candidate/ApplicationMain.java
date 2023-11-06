package com.candidate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
						+ "1. Get party wise votes count\n"
						+ "2. Add a new candidate\n"
						+ "3. Update details of a candidate\n"
						+ "4. Delete candidate with given id\n"
						+ "5. Find candidate of given id\n"
						+ "6. Find all candidates\n"
						+ "7. Find candidates by party name\n"
						+ "Please enter your choice: ");

				choice = sc.nextInt();

				switch(choice) {
				
				//EXIT
				case 0:
					System.out.println("-----------------------------");
					System.out.println("Thank you for using our app !");
					break;
					//getPartywiseVotes
				case 1:
					System.out.println("-----------------------------------------");
					try(CandidateDao dao = new CandidateDao()) {
						List<PartyVotes> list = dao.getPartywiseVotes();
						list.forEach(e -> System.out.println(e));
					} catch (Exception e) {
						e.printStackTrace();
					}

					break;
					//Add a new candidate - save
				case 2:
					System.out.println("-----------------------------------------");
					try(CandidateDao dao = new CandidateDao()) {
						Candidate c = acceptCandidate(sc);
						int count = dao.save(c);
						System.out.println("Rows Updated: " + count);
						System.out.println("Candidate added successfully! ");
					} // dao.close();
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
					//Candidate update 
				case 3:
					try(CandidateDao dao = new CandidateDao()){
						Candidate c = updateCandidate(sc);
						int count = dao.update(c);
						System.out.println("Rows Updated: " + count);
						System.out.println("Candidate added successfully! ");
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
					//Delete candidate with given id
				case 4:
					System.out.println("---------------------------------------------------");
					try(CandidateDao dao = new CandidateDao()) {
						System.out.print("Enter id: ");
						int id = sc.nextInt();
						int rowCount = dao.deleteById(id);
						System.out.println("Rows Deleted: " + rowCount);
						System.out.println("Candidate deleted successfully");
					} // dao.close();
					catch (Exception e) {
						e.printStackTrace();
					}

					break;
					// Find candidate of given id 
				case 5:
					System.out.println("-----------------------------------------");
					try(CandidateDao dao = new CandidateDao()) {
						System.out.print("Enter id: ");
						int id = sc.nextInt();
						Candidate cFoundCandidate = new Candidate();
						cFoundCandidate = dao.findById(id);
						System.out.println(cFoundCandidate);
					} // dao.close();
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
					//Find all
				case 6:
					System.out.println("----------------------------------------------------------------");
					try(CandidateDao dao = new CandidateDao()) {
						List<Candidate> list = dao.findAll();
						list.forEach(c -> System.out.println(c));
					} // dao.close();
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
					//find by party
				case 7:
					System.out.println("-----------------------------------------");
					try(CandidateDao dao = new CandidateDao()) {
						System.out.print("Enter party: ");
						String party = sc.next();
						List<Candidate> list = dao.findByParty(party);
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
	
	public static Candidate acceptCandidate(Scanner sc) {
		int ide = 0;
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate(ide, name, party, votes);	
		return c;
	}
	
	public static Candidate updateCandidate(Scanner sc) {
		System.out.print("Enter the id of the candidate you want to Update: ");
		int idx = sc.nextInt();
		System.out.print("Enter new Name: ");
		String name = sc.next();
		System.out.print("Enter new Party: ");
		String party = sc.next();
		System.out.print("Enter new Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate(idx, name, party, votes);	
		return c;
	}

}

package com.tester;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.employee.Employee;

public class MainApplication {

	public static void main(String[] args) {
		int choice = 0;
		
		List<Employee> list = new LinkedList<Employee>(); 
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("-------------------------------------------------");
			System.out.println("Please select option from the menu given below : ");
			System.out.println("0. Exit\n"
					+ "1. Add a employee\n"
					+ "2. Delete a employee\n"
					+ "3. Find a employee\n"
					+ "4. Sort all employees' list\n"
					+ "5. Edit/Update a employees' details\n"
					+ "6. Display all employees in employee list\n"
					);
			System.out.println("Please enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice){
				//Exit with message
				case 0:
					System.out.println("-------------------------------------");
					System.out.println("Thank you for using our application!");
					break;
				//Add a employee
				case 1:
					System.out.println("-------------------------------------");
					Employee employeeToAdd = new Employee();
					employeeToAdd.acceptEmployee();
					list.add(employeeToAdd);
					System.out.println("----------------------------");
					System.out.println("Employee added successfully!");
					break;
				//Delete a employee
				case 2:
					System.out.println("------------------------------------------------");
					System.out.println("Enter the id of the employee you want to delete: ");
					int empDeleteId = sc.nextInt();
					Employee empToDelete = new Employee();
					empToDelete.setEmpId(empDeleteId);
					if(list.contains(empToDelete)) {
						list.remove(empToDelete);
						System.out.println("----------------------------");
						System.out.println("Employee added successfully!");
					}
					else {
						System.out.println("----------------------------");
						System.out.println("Can't delete employee. Employee not found !");
					}
					break;
				//Find a employee
				case 3:
					System.out.println("----------------------------------------------");
					System.out.println("Enter the id of the employee you want to find: ");
					int empFindId = sc.nextInt();
					Employee e = new Employee();
					e.setEmpId(empFindId);
					int index = list.indexOf(e);
					if(index <list.size() && index!=-1) {
						System.out.println("----------------------------");
						System.out.println("Employee found!");
						System.out.println(list.get(index).toString());
					}
					else {
						System.out.println("--------------------");
						System.out.println("Employee not found !");
					}
					break;
				//Sort all employees' list
				case 4:
					Collections.sort(list);
					System.out.println("---------------------------------------");
					System.out.println("Employee list sorted on the basis of id");
					break;
				//Edit/Update a employees' details
				case 5:
					System.out.println("----------------------------");
					System.out.println("Enter emp id to be modified: ");
					int id = sc.nextInt();
					Employee key = new Employee();
					key.setEmpId(id);
					int indexy = list.indexOf(key);
					if(indexy == -1)
					    System.out.println("Employee not found.");
					else {
					    Employee oldEmp = list.get(indexy);
					    System.out.println("Employee Found: " + oldEmp);
					    System.out.println("Enter new information for the Employee");
					    Employee newEmp = new Employee();
					    newEmp.acceptEmployee();
					    list.set(indexy, newEmp);
					}
					break;
					//Display all employees in employee list
				case 6:
					System.out.println("------------------------------------------------------");
					System.out.println("Employee list: ");
					for(Employee emp : list) {
						System.out.println(emp.toString());
					}
					break;
				default:
					System.out.println("Please enter a valid choice from the above menu!");
					break;
			}
		}while(choice!=0);
	}
}

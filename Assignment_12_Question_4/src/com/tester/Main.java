package com.tester;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.employee.Employee;

//Create PriorityQueue<> of Employee. 
//Add employees in the queue and ensure that employees are deleted in desc order of their salaries.

public class Main {

	public static void main(String[] args) {
		
		class salaryDescComparator implements Comparator <Employee>{

			@Override
			public int compare(Employee o1, Employee o2) {
				double diff = o1.getSalary() - o2.getSalary();
				if(diff==0)
					return 0;
				else if(diff > 0)
					return -1;
				else
					return 1;
			}
		}
		
		Queue<Employee> q = new PriorityQueue<Employee>(new salaryDescComparator());
		q.offer(new Employee(1,"Anurag", "M","Technology Engineering", 300000));
		q.offer(new Employee(2,"Sainath", "I","Sleep Engineering", 300000));
		q.offer(new Employee(3,"Sandesh", "T","Bike Engineering", 200000));
		q.offer(new Employee(4,"Mayur", "K","Documentation Engineering", 80000));
		q.offer(new Employee(5,"Mayuresh", "P","DMC Engineering", 100000));
		q.offer(new Employee(6,"Rishi", "S","Discrete maths", 500000));
		
		
		
		while(!q.isEmpty()) {
			Employee ele = q.poll();
			System.out.println("Popped: " + ele);
		}
	}
}

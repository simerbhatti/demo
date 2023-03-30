package com.example.demo.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * 
 * @author simerdeep.singh
 *
 */
public class DemoTest {
	
	public static void main(String[] args) {
		new DemoTest().findThirdLargest();
	}
	
	private class Employee {
		

		private String name;
		private int salary;
		
		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}

		
	}
	private void findThirdLargest() {
		
		List<Employee> emps = new ArrayList<>();
		Employee e1 = new Employee("e1",5);
		Employee e2 = new Employee("e2",4);
		Employee e3 = new Employee("e3",7);
		Employee e4 = new Employee("e4",3);
		Employee e5 = new Employee("e5",6);
		Employee e6 = new Employee("e6",2);
		Employee e7 = new Employee("e7",8);
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);
		emps.add(e7);
		System.out.println( emps.stream().map(m -> m.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst().get());
		

	}
}

package org.example.reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reduceDemo {
	
	public static void main(String[] args) {
		
		List<Employee> employees = Stream.of(
                new Employee(123, "piyush", "piyush@gmail.com", 100000),
                new Employee(124, "harshit", "harshit@gmail.com", 200000),
                new Employee(125, "deepak", "deepak@gmail.com", 400000),
                new Employee(125, "pooja", "gita@gmail.com", 600000),
                new Employee(125, "sita", "sita@gmail.com", 500000)
        ).collect(Collectors.toList());
		
		// average salary of all employee
		double averageSalary = employees.stream()
				.map(emp -> emp.getSalary())
				.mapToDouble(i -> i)
				.average().getAsDouble();
		System.out.println(averageSalary);
		
		// average salary of all employee whose salary is grater then 30000
		
		double averageSalary2 = employees.stream()
				.filter(emp -> emp.getSalary() > 300000)
				.map(emp -> emp.getSalary())
				.mapToDouble(i -> i)
				.average().getAsDouble();
		System.out.println(averageSalary2);
				
		// average salary of all employee
		double sumSalary = employees.stream()
				.map(emp -> emp.getSalary())
				.mapToDouble(i -> i)
				.sum();
		System.out.println(sumSalary);
	}

}

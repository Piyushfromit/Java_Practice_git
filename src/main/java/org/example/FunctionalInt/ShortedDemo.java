package org.example.FunctionalInt;

import org.example.reduce.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ShortedDemo {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(7, "Piyush", "It" , 10000));
		employees.add(new Employee(5, "Bittu", "It" , 20000));
		employees.add(new Employee(9, "Golu", "It" , 5000));
		employees.add(new Employee(6, "Chintu", "It" , 250000));
		
		employees.stream().sorted(( o1,  o2)-> o1.getSalary() - o2.getSalary()).forEach( s -> System.out.println(s));
	    // Using Function functional Interface  // comparing internally using
		employees.stream().sorted(Comparator.comparing(emp-> emp.getSalary())).forEach( s -> System.out.println(s));
		// Using Method reference insted of lambda Expression
		employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach( System.out::println);
		
	}
}

 

package org.example.parallelseream;

import org.example.reduce.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ParallelStreamDemo3 {
	
	public static List<Employee> getEmpList(){
		List<Employee> employees = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			employees.add(new Employee
			(i, "employee_"+i,"dept_"+i,(Integer.valueOf(new Random().nextInt(1000*100))) ));
		}	
		return employees;
	}
	public static void main(String[] args){
		long startTime = 0;
		long endTime = 0;
		List<Employee> employees = getEmpList();
		startTime= System.currentTimeMillis();
		double averageSalary = employees.stream()
				.map(e -> e.getSalary() )
		        .mapToDouble(i->i)
		        .average()
		        .getAsDouble();
		endTime= System.currentTimeMillis();
		System.out.println("Normal stream execution Time: "+ (endTime - startTime)+" milli sec");
		
		// Using Parallel Stream
		startTime= System.currentTimeMillis();
		double averageSalary2 = employees.parallelStream()
				.map(e -> e.getSalary() )
		        .mapToDouble(i->i)
		        .average()
		        .getAsDouble();
		endTime= System.currentTimeMillis();
		System.out.println("Parallel stream execution Time: "+ (endTime - startTime)+" milli sec");
	     System.out.println("Average salary: "+ averageSalary +  " and "+ averageSalary2);

	}
}

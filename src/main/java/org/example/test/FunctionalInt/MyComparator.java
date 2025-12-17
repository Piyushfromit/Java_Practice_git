package org.example.test.FunctionalInt;

import java.util.Comparator;

import org.example.test.reduce.Employee;

public class MyComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary() - o2.getSalary();
	}
}

package org.example.reduce;


public class Employee {
	
	private int id;
	private String  name;
	private String  dept;
	private int  salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getDept() {
		return dept;
	}

	
	public void setDept(String dept) {
		this.dept = dept;
	}

	
	public int getSalary() {
		return salary;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	

}

package org.example.test;




public class Student implements Comparable<Student>{

	    private String name;
	    private String phone;
	    private String mail;
	    private int roll;

	    public Student(String name, String phone, String mail, int roll) {
	        this.name = name;
	        this.phone = phone;
	        this.mail = mail;
	        this.roll = roll;
	    }

	    // Other methods as before...

	    public int compareByName(Student student) {
	        return this.name.compareTo(student.name);
	    }

	    public int compareByRoll(Student student) {
	        if (this.roll > student.roll) {
	            return 1;
	        } else if (this.roll < student.roll) {
	            return -1;
	        } else {
	            return 0;
	        }
	    }

	    @Override
	    public String toString() {
	        return "Student [name=" + name + ", phone=" + phone + ", mail=" + mail + ", roll=" + roll + "]";
	    }

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return 0;
		}
	
	
	
}

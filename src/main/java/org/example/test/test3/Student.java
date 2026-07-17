package org.example.test.test3;





public class Student {

    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student stu = new Student("Piyush" , 12);
        stu.name = "Piyush";
    }


}

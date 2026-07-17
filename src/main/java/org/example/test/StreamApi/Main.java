package org.example.test.StreamApi;


import org.example.test2.Int;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();

        students.add(new Student(1, 1, "Piyush", "kumar", 34,
                Arrays.asList("7277818544", "7903191158"),
                new Address( 1, "Bihar", "Patna", "mithapur","804453")
        ));

        students.add(new Student(2, 2, "Ankit", "Rawat", 25,
                Arrays.asList("7277818544", "7903191158"),
                new Address( 1, "UP", "Noida", "khurja","201301")
        ));
        students.add(new Student(3, 3, "Vikash", "mahato", 24,
                Arrays.asList("7277818544", "7903191158"),
                new Address( 1, "Maharashtra", "Pune", "mahatonagar","654564")
        ));
        students.add(new Student(4, 4, "Arun", "yadav", 18,
                Arrays.asList("7277818544", "7903191158"),
                new Address( 1, "Delhi", "Jaitpur", "teapoint","398098")
        ));

        // get the list of first name of student:
        List<String> names= students.stream().map(s -> s.getFirstName() ).toList();
        System.out.println(names);

        // get the list of Last name of student in upper case:
        List<String> names2= students.stream().map(s -> s.getLastName().toUpperCase() ).toList();
        System.out.println(names2);

        // get the list of full  name of student in upper case:
        List<String> names3= students.stream().map(s -> (s.getFirstName() +" "+s.getLastName()).toUpperCase() ).toList();
        System.out.println(names3);


        List<String> names4= students.stream().filter(s -> s.getYear() > 25 ).map(t -> t.getFirstName()).toList();
        System.out.println(names4);


        Long names5 = students.stream().filter(s -> s.getYear() > 25 ).count();
        System.out.println(names5);


        Student stu = students.stream().min(Comparator.comparing(Student::getYear)).orElseThrow();
        System.out.println(stu);

        List<String> states = students.stream().map(s -> s.getAddress().getState()).toList();
        System.out.println( states);

        students.stream().map(s -> s.getPhones());
    }
}

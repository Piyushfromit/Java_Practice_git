package org.example.test.StreamApi;


import org.example.test2.Int;

import java.util.*;
import java.util.stream.Collectors;

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

        List<String> phones = students.stream().flatMap(s-> s.getPhones().stream()).toList();
        System.out.println(phones);

        List<String> phonesd = students.stream().flatMap(s-> s.getPhones().stream()).distinct().toList();
        System.out.println(phonesd);

        List<Student> shortedStudent = students.stream().sorted(Comparator.comparing(s -> s.getFirstName())).toList();
        System.out.println(shortedStudent);

        List<Student> shortedStudentNyYear = students.stream().sorted(Comparator.comparing(Student::getYear)).toList();
        System.out.println(shortedStudentNyYear);

        Map<Long, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getYear));
        System.out.println(map);

        Map<String, List<Student>>  map2 = students.stream().collect(Collectors.groupingBy(s -> s.getAddress().getState()));
        System.out.println(map2);

        Map<Long, List<String>> map3 = students.stream().collect(Collectors.groupingBy(
                Student::getYear,
                Collectors.mapping(Student::getFirstName, Collectors.toList())
        ));
        System.out.println(map3);

        Map<Long, List<Student>> ss= students.stream().collect(Collectors.groupingBy(Student::getYear));
        System.out.println(ss);

        Map<String, List<Student>> sss = students.stream().collect(Collectors.groupingBy(
                s->s.getAddress().getState()));
        System.out.println(sss);

        Map<String, Long> ssss = students.stream().collect(Collectors.groupingBy(
                s->s.getAddress().getState(),
                Collectors.counting()));
        System.out.println(ssss);

        Map<String, List<String>> sssss = students.stream().collect(Collectors.groupingBy(
                s->s.getAddress().getState(),
                Collectors.mapping(Student::getFirstName, Collectors.toList())));
        System.out.println(sssss);

        Map<String, Long> ssssss = students.stream().collect(Collectors.groupingBy(
                s->s.getAddress().getState(),
                Collectors.summingLong(Student::getYear)));
        System.out.println(ssssss);

        Map<String, Long> sssssss = students.stream().collect(Collectors.groupingBy(
                s->s.getAddress().getState(),
                Collectors.summingLong(Student::getYear)));
        System.out.println(sssssss);

        Map<String, Optional<Student>> ssssssss = students.stream().collect(Collectors.groupingBy(
                s->s.getAddress().getState(),
                Collectors.maxBy(Comparator.comparing(Student::getYear))));
        System.out.println(ssssssss);


        Map<String, Student> result = students.stream().collect(Collectors.groupingBy(
                        s -> s.getAddress().getState(),
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getYear)),
                                Optional::get
                        )
                ));

        System.out.println(result);




    }
}

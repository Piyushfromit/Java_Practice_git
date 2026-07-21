package org.example.test.StreamApi3;





import java.util.*;
import java.util.stream.Collectors;

public class MyClass {

    public static void main(String[] args) {

String sss=new String("Welcome");

        List<String> names = Arrays.asList("Piyush" , "Aniket", "Kavita", "Aayush");

        Map<String, Long> myMap =
                String.join("", names).chars().mapToObj(s-> String.valueOf((char)s))
                .collect(Collectors.groupingBy(s->s, Collectors.counting()));

        myMap.forEach((k,v) -> System.out.println(k+" => "+ v));



        String.join("", names).chars().mapToObj(s-> String.valueOf((char)s))
                .collect(Collectors.groupingBy(s->s, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k+" => "+ v));

        myMap.forEach((k,v) -> System.out.println(k+" => "+ v));


        Map<String, Long> myMap2 =
                String.join("", names).chars().mapToObj(s-> String.valueOf((char)s))
                        .collect(Collectors.groupingBy(s->s, Collectors.counting()));

        myMap2.forEach((k,v) -> System.out.println(k+" => "+ v));


        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Piyush", "M", "876876876876",50, new Address("Patna", "Bihar")));
        list.add(new Employee("AAyush", "M", "765765756756", 20, new Address("Motihari", "Bihar")));
        list.add(new Employee("Aniket", "M", "432432424342", 25, new Address("Nalanda", "Bihar")));
        list.add(new Employee("Kabita", "F", "498098080989", 45, new Address("Lakhanow", "UP")));


        Optional<Employee> emp =  list.stream().sorted(Comparator.comparing(Employee::getAge)).findFirst();

        System.out.println(" Yengest Employee:" +emp.get());


        Map<String , List<Employee>> map = list.stream().filter(s-> s.getAddress().getState() != "Bihar")
                .collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(map);



        //count of male and feemal

    }
}

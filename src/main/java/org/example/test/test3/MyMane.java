package org.example.test.test3;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyMane {


    public static void main(String[] args) {


        List<Employee> empList = new ArrayList<>();


        Dept dept1 = new Dept(1L, "Development");
        Dept dept2 = new Dept(2L, "HR");

        empList.add(new Employee("Piyush" , "Noida" , 5000L, 32L, dept1 ));
        empList.add(new Employee("Aaush" , "Patna" , 6000L , 55L, dept2 ));
        empList.add(new Employee("Ram" , "Delhi" , 7000L , 44L, dept1 ));


        myMethod(empList);

       // myMethod2(empList);


    }


    public static Map<Dept, List<Employee>> myMethod(List<Employee> empList) {

        Map<Dept, List<Employee>> result = empList.stream()
                       .collect(Collectors.groupingBy(Employee::getDept));

        Map<String, List<Employee>> result3 = empList.stream()
                        .collect(Collectors.groupingBy(emp -> emp.getDept().getName()));

        System.out.println(result);
        return  result;

    }

    public static void myMethod2(List<Employee> empList) {

        List<Employee> result = empList.stream()
                .filter(emp -> emp.getAge()<50).toList();


        List<Employee> emp = empList.stream().filter(s-> s.getAge()> 40).toList();

        List<Employee> empL = empList.stream().filter(s-> s.getSalary()> 6000).toList();

        List<String> str = empList.stream().map(s -> s.getName()).toList();

        List<String> deptName = empList.stream().map(s-> s.getDept().getName()).distinct().toList();




    }




}

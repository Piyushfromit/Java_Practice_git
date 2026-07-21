package org.example.test.test4;


import java.util.*;
import java.util.stream.Collectors;

public class MyClass {

    public static void main(String[] args) {

        List<List<String>> list = new ArrayList<>();

        List<String> names1 = Arrays.asList("Piyush", "Aniket", "Ram", "Shyam");
        List<String> names2 = Arrays.asList("Raza", "Bishal", "Manoj", "DeepakKumar");

        list.add(names1);
        list.add(names2);

        List<String> newList = list.stream().flatMap(Collection::stream).toList();
        System.out.println(newList);

        Map<Integer, List<String>> ans =  list.stream().flatMap(Collection::stream).collect(Collectors.groupingBy(String::length ));
        System.out.println(ans);

        String ss = list.stream().flatMap(Collection::stream).max(Comparator.comparing(String::length)).orElseThrow();
        System.out.println(ss);

        Map<Character, List<String>> anss =  list.stream().flatMap(Collection::stream).collect(Collectors.groupingBy(s -> s.charAt(0) ));
        System.out.println(anss);

        Map<Character, Long> ansss =  list.stream().flatMap(Collection::stream).collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting() ));
        System.out.println(ansss);

        // partitioningBy()


    }
    //ctrl +alt + v
    //ctrl +alt + m
}

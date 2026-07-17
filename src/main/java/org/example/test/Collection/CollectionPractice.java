package org.example.test.Collection;


import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

public class CollectionPractice  {


    Set<String> names = new TreeSet<>();

    List<String> name = new ArrayList<>();

    SortedSet<String> set = new TreeSet<>();

    List<String> name2 = new Stack<>();

    Set<String> names3 = new CopyOnWriteArraySet<>();


    public static void main(String[] args) {
        String str = "apple";

        String result = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());

        System.out.println(result);

        List<Integer> list = Arrays.asList(4, 6, 3, 7, 89, 3, 5, 455, 23, 28);
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);




    }
}

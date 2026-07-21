package org.example.test.StreamApi2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyClass {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> name1 = Arrays.asList("Aniket","Ayush", "Piyush", "Kabita");
        List<String> name2 = Arrays.asList("Pintu","Ansh", "Raj", "Aakash");
        List<String> name3 = Arrays.asList("Rajesh","Aarun", "kajal", "Aakash");
        list.add(name1);
        list.add(name2);
        list.add(name3);
        System.out.println(list);


        List<String> phones = list.stream().flatMap(s-> s.stream()).filter(s->s.startsWith("A")).toList();
        System.out.println(phones);


        List<String> phones2 = list.stream().flatMap(s-> s.stream()).filter(s->!s.startsWith("A")).toList();
        System.out.println(phones2);

        Map<String, Long> nameLength = list.stream().flatMap(s-> s.stream()).distinct()
                .collect(Collectors.groupingBy(s->s, Collectors.summingLong(String::length)));
        System.out.println(nameLength);


        Map<String, Long> nameCount = list.stream().flatMap(s-> s.stream())
                .collect(Collectors.groupingBy(s->s, Collectors.counting()));
        System.out.println(nameCount);


        Map<String, Integer> nameLength2 = list.stream().flatMap(s-> s.stream()).distinct()
                .collect(Collectors.toMap(s->s, s->s.length()));

        System.out.println(nameLength2);




    }
}

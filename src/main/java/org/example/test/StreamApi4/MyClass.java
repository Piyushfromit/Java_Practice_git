package org.example.test.StreamApi4;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {

    public static void main(String[] args) {

        String name = "PiyushPiyusheRam";

//        // return string of unique char
//        name.chars().mapToObj(s-> (char) s)
//                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new,  Collectors.counting()))
//                .entrySet()
//                .stream().filter(s-> s.getValue()>1)
//                .forEach( v -> System.out.println( v.getKey() ));


        Character ch = name.chars().mapToObj(s-> (char) s)
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new,  Collectors.counting()))
                .entrySet()
                .stream()
                .filter( (s-> s.getValue() ==1 && checkConsonent(s.getKey()))

                ).findFirst().get().getKey();

        System.out.println(ch);
        //System.out.println(res);




    }

    static boolean checkConsonent(Character c){
          if (c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
              return false;
          }else{
              return true;
          }
    }




}

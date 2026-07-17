package org.example.test.Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {


    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();


        map.put("FB", "Ram");
        map.put("Fa", "Shyam");



        for(Map.Entry<String , String> entry : map.entrySet()){
            System.out.println( entry.hashCode() );
        }


    }

}

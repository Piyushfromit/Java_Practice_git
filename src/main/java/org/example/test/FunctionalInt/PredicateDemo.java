package org.example.test.FunctionalInt;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {
	
	public static void main(String[] args) {
        
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        
        list.stream().filter(t -> t % 2 == 0).forEach (t -> System.out.println("Print Even:  " + t));
			
	}
}

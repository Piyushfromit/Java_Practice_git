package org.example.FunctionalInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SupplierDemo{

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
	       
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(9);
		list.add(2);
		list.add(5);
		
		// Traditional way, Without using Stream API
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		// Using Stream API // By default it is ascending
		list = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> newList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(newList);
		
		list.stream().sorted().forEach(s -> System.out.println(s));
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));  // dencending order ascending
		
	}
}

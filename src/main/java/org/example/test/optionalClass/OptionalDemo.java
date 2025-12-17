package org.example.test.optionalClass;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

	
	public static void main(String[] args) {
		
		Customer customer = new Customer(101, "johan", null, Arrays.asList("5656656565", "5433789067"));
		
		Optional<Object> emptyOptional = Optional.empty();
		
		System.out.println(emptyOptional);
		
	}
	
	
	
	
}

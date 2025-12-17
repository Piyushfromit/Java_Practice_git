package org.example.test.parallelseream;

import java.util.stream.IntStream;

public class ParallelStreamDemo {
	
	public static void main(String[] args) {
		
		long startTime = 0;
		long endTime = 0;
		
		startTime= System.currentTimeMillis();
		IntStream.range(1, 20).forEach(i -> System.out.print(i));
		System.out.println();
		endTime= System.currentTimeMillis();
		System.out.println("Plane Stream Taken time: " + (endTime -startTime) );
		System.out.println("****************************");
		startTime= System.currentTimeMillis();
		IntStream.range(1, 20).parallel().forEach(i -> System.out.print(i));
		System.out.println();
		endTime= System.currentTimeMillis();
		System.out.println("Parallel Stream Taken time: " + (endTime -startTime) );
		// Parallel Stream will not follow the order of execution
		
	}

}

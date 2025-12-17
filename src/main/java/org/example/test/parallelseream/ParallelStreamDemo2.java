package org.example.test.parallelseream;

import java.util.stream.IntStream;

public class ParallelStreamDemo2 {
	public static void main(String[] args) {
		
		IntStream.range(1, 10).forEach(i -> 
		     System.out.println("Thread: " + Thread.currentThread().getName()+" : " +i)
		);
		IntStream.range(1, 10).parallel().forEach(i -> 
	     System.out.println("Thread: " + Thread.currentThread().getName()+" : " +i)
	    );
	}
}

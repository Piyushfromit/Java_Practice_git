package org.example.test.Thread;




public class ThreadMethods {

    public static void main(String[] args) {

        System.out.println("Hello");

        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setName("Piyush");

        System.out.println(Thread.currentThread().getName());

    }
}

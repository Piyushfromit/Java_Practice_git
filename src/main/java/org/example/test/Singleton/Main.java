package org.example.test.Singleton;




public class Main {

    public static void main(String[] args) {

        Singleton o1 = Singleton.INSTANCE;
        Singleton o2 = Singleton.INSTANCE;

        System.out.println(o1 == o2);
    }
}

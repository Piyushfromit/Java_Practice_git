package org.example.test.StaticSynchronization;



public class MovieBookApp {

    public static void main(String[] args) {
        BookTheaterSeat b1 = new BookTheaterSeat();

        MyThread1 t1 = new MyThread1(b1, 7);
        t1.start();

        MyThread1 t2 = new MyThread1(b1, 6);
        t2.start();

        BookTheaterSeat b2 = new BookTheaterSeat();

        MyThread1 t3 = new MyThread1(b2, 8);
        t3.start();

        MyThread1 t4 = new MyThread1(b2, 9);
        t4.start();


    }


}

package org.example.test.Thread;



public class SynchronizationByMethod extends Thread{


    static BookTheaterSeat b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();

        SynchronizationByMethod deepak = new SynchronizationByMethod();
        deepak.seats = 7;
        deepak.start();

        SynchronizationByMethod amit = new SynchronizationByMethod();
        amit.seats = 6;
        amit.start();
    }






}

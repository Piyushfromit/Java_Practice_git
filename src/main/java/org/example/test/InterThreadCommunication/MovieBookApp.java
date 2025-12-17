package org.example.test.InterThreadCommunication;

public class MovieBookApp {
    public static void main(String[] args) {
        TotalEarnings te = new TotalEarnings();
        te.start();
        // System.out.println("Total earnings: "+ te.total+ " rs");
        synchronized (te){
            try {
                te.wait( );  // main thread will wait until notified by te thread
                // te.wait( 1000); // this will wait only 1 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total earnings: "+ te.total+ " rs");
        }
    }
}

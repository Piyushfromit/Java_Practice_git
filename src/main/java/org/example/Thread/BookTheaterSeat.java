package org.example.Thread;

public class BookTheaterSeat {


    int total_seats = 10;

    synchronized void bookSeat(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + " seats booked successfully");
            total_seats = total_seats - seats;
            System.out.println("Seats Left: " + total_seats);
        } else {
            System.out.println("Sorry, seats cannot be booked...!!");
            System.out.println("Seats Left: " + total_seats);
        }
    }



}

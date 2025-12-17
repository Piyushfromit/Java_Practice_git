package org.example.test.StaticSynchronization;



public class BookTheaterSeat {

     static int total_seats = 20;

     static synchronized void bookSeat(int seats){
         if(total_seats >= seats){
             System.out.println(seats+ "  :Seats booked successfully!");
             total_seats = total_seats - seats;
             System.out.println("seats left! " + total_seats);
         }else{
             System.out.println("seats cannot be booked");
             System.out.println("seats left: " + total_seats);
         }
     }


}

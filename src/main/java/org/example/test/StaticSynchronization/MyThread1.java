package org.example.test.StaticSynchronization;

public class MyThread1 extends  Thread{

      BookTheaterSeat b;
      int seats;


      MyThread1(BookTheaterSeat b, int seats){
          this.b = b;
          this.seats=seats;
      }

      public void run() {
         b.bookSeat(seats);
      }
}

package org.example.test.InterThreadCommunication;



public class TotalEarnings  extends  Thread{
    int total =0;
    public void run () {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            // It Tells main threads to start execution.
            this.notify();
            // It Tells all other threads to start execution.
            // this.notifyAll();
        }
    }
}



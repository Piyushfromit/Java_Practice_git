package org.example.test.Thread;


public class DaemonThread  extends  Thread{

    @Override
    public void run() {
        System.out.println("[Daemon] started. isDaemon=" + Thread.currentThread().isDaemon());
        try {
            while (true) {
                System.out.println("[Daemon] working...");
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("[Daemon] interrupted");
        }
    }

    Thread user = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("[User] started. isDaemon=" + Thread.currentThread().isDaemon());
            try {
                // Simulate some user work
                Thread.sleep(2000);
                System.out.println("[User] finished work");
            } catch (InterruptedException e) {
                System.out.println("[User] interrupted");
            }
        }
    }, "user-worker");


    public static void main(String [] args){
        System.out.println("Deman thread");
        //System.out.println ("main thread") ;
        DaemonThread t=new DaemonThread() ;
        t.setDaemon(true) ;
        t.start();
    }
}

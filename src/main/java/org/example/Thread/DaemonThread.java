package org.example.Thread;


public class DaemonThread  extends  Thread{

    @Override
    public void run () {
        System.out.println("daemon thread");
        System.out.println(Thread.currentThread().isDaemon());
    }

    public static void main(String [] args){
        //System.out.println ("main thread") ;
        DaemonThread t=new DaemonThread() ;
        t.setDaemon(true) ;
        t.start();
    }
}

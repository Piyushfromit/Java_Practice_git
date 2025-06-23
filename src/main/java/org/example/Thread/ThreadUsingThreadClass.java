package org.example.Thread;



public class ThreadUsingThreadClass extends Thread {

    @Override
    public void run() {
        // Thread.currentThread().setName("piyush");
        System.out.println("Thread task  "+Thread.currentThread().getName());
    }

    public static void main (String[] args){
        System.out.println("hello: "+Thread.currentThread().getName() ) ;
        ThreadUsingThreadClass t1=new ThreadUsingThreadClass();
        t1.setName ("deepak") ;
        t1.start() ;
        ThreadUsingThreadClass t2 = new ThreadUsingThreadClass() ;
        t2.setName ("smart programming") ;
        t2.start();
        System.out.println("End Task");
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t1.isAlive());
    }

}

package org.example.test.Thread;

public class LifeCycle extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING....");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws  InterruptedException{
        LifeCycle l1 = new LifeCycle();
        System.out.println(l1.getState());
        l1.start();
        System.out.println(l1.getState());
        Thread.sleep(100); // Sleeping main thread for 0.1 sec
        System.out.println(l1.getState());
        l1.join();
        System.out.println(l1.getState());
    }
}

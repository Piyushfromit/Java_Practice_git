package org.example.test.Thread;

public class ThreadUsingRunnableInterface  implements  Runnable{

    @Override
    public void run() {
        System.out.println("Hi This si my Thread task 2");
    }

    public static void main(String[] args) {
        ThreadUsingRunnableInterface test = new ThreadUsingRunnableInterface();
        Thread th = new Thread(test);
        th.start();
        // th.start();   // Exception in thread "main" java.lang. IllegalThreadStateException
    }


}

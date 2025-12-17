package org.example.test.Thread;

// File: DaemonBasics.java
public class DaemonBasics {
    public static void main(String[] args) throws InterruptedException {
        // Daemon thread (background)
        Thread daemon = new Thread(new Runnable() {
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
        }, "daemon-worker");
        daemon.setDaemon(true); // must be BEFORE start()
        daemon.start();

        // User (non-daemon) thread
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
        user.start();

        // Wait for the user thread to finish
        user.join();

        System.out.println("[Main] user thread finished; JVM will now exit and kill daemon thread.");
        // Note: We do NOT join on the daemon thread.
        // When main and all user threads complete, the JVM exits—even if the daemon loop is still running.
    }
}

package org.example.test.Singleton;



public class ABC {

    // Object is created immediately when the class is loaded
    private static ABC obj = new ABC();

    // Private constructor
    private ABC() { }

    // Global access point
    public static ABC getInstance() {
        return obj;
    }





}

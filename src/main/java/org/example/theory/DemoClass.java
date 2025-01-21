package org.example.theory;

public class DemoClass implements DemoInterface {

    @Override
    public void doSomething() {
        System.out.println("Implemented Method: Doing something in the class! 0");
    }

    public static void main(String[] args) {
        DemoClass demo = new DemoClass();

        // Calling the abstract method (implemented in the class)
        demo.doSomething();

        // Calling the default method (inherited from the interface)
        demo.doSomethingDefault();

        // Calling the static method directly from the interface (not from the class)
        DemoInterface.doSomethingStatic();

        // Calling the default method which internally calls private static method
        demo.callPrivateStatic();

        // Calling the default method which internally calls private non-static method
        demo.callPrivateNonStatic();


    }
}

package org.example.test.theory;

public class DemoClass2 extends DemoAbstractClass {

    @Override
    public void doSomething() {
        System.out.println("Implemented Method: Doing something in the class!  1");
    }

    public static void main(String[] args) {
        DemoClass2 demo = new DemoClass2();

        // Calling the abstract method (implemented in the class)
        demo.doSomething();

        // Calling the concrete method (inherited from the abstract class)
        demo.doSomethingConcrete();

        // Calling the static method directly from the class (not from the instance)
        DemoAbstractClass.doSomethingStatic();

        // Calling the concrete method which internally calls private static method
        demo.callPrivateStatic();

        // Calling the concrete method which internally calls private non-static method
        demo.callPrivateNonStatic();
    }
}
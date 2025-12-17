package org.example.test.theory;

public interface DemoInterface {

    // 1. Abstract Method (implicitly public)
     void doSomething();

    // 2. Default Method (with implementation)
    default void doSomethingDefault() {
        System.out.println("Default Method: Doing something default! 1");
    }

    // 3. Static Method (with implementation)
    static void doSomethingStatic() {
        System.out.println("Static Method: Doing something static! 2");
    }

    // 4. Private Method (non-static) can not accessable from outside
    private void privateHelper() {
        System.out.println("Private Helper Method: Helping with something non-static. 3");
    }

    // 5. Private Static Method
    private static void privateStaticHelper() {

        System.out.println("Private Static Helper Method: Helping with something static. 4");
    }

    // 6. Default method calling a private static method (just for demonstration)
    default void callPrivateStatic() {
        privateStaticHelper();  // Calling private static method from default method
        System.out.println("Default Method calling private static helper. 5");
    }

    // 7. Default method calling a private non-static method (just for demonstration)
    default void callPrivateNonStatic() {
        privateHelper();  // Calling private non-static method from default method
        System.out.println("Default Method calling private non-static helper. 6");
    }
}



package org.example.test.theory;

public abstract class DemoAbstractClass {

    // 1. Abstract Method (implicitly public)
    public abstract void doSomething();

    // 2. Concrete Method (with implementation)
    public void doSomethingConcrete() {
        System.out.println("Concrete Method: Doing something concrete!  2");
    }

    // 3. Static Method (with implementation)
    public static void doSomethingStatic() {
        System.out.println("Static Method: Doing something static!  3");
    }

    // 4. Private Method (non-static)
    private void privateHelper() {
        System.out.println("Private Helper Method: Helping with something non-static.  4");
    }

    // 5. Private Static Method
    private static void privateStaticHelper() {
        System.out.println("Private Static Helper Method: Helping with something static.  5");
    }

    // 6. Concrete method calling private static method (just for demonstration)
    public void callPrivateStatic() {
        privateStaticHelper();  // Calling private static method from concrete method
        System.out.println("Concrete Method calling private static helper. 6");
    }

    // 7. Concrete method calling private non-static method (just for demonstration)
    public void callPrivateNonStatic() {
        privateHelper();  // Calling private non-static method from concrete method
        System.out.println("Concrete Method calling private non-static helper. 7");
    }
}




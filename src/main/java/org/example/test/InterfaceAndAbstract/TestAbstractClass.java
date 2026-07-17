package org.example.test.InterfaceAndAbstract;




// Abstract class example in Java 17
public abstract class TestAbstractClass {

    /* =========================
       VARIABLES IN ABSTRACT CLASS
       ========================= */

    // 1. Instance Variable (Normal variable)
    // Each object will have its own copy
    int instanceVariable = 10;

    // 2. Static Variable
    // Shared among all objects of the class
    static int staticVariable = 20;

    // 3. Final Variable (Constant)
    // Value cannot be changed once assigned
    final int finalVariable = 30;

    // 4. Static Final Variable (Constant - best practice)
    // Commonly used for constants
    static final int STATIC_FINAL_VARIABLE = 40;

    // 5. Protected Variable
    // Accessible within same package and subclasses
    protected int protectedVariable = 50;

    // 6. Private Variable
    // Accessible only inside this class
    private int privateVariable = 60;



    /* =========================
       METHODS IN ABSTRACT CLASS
       ========================= */

    // 1. Abstract Method
    // Must be implemented by subclass
    // No method body allowed
    public abstract void abstractMethod();


    // 2. Abstract Method with parameters
    // Subclass must provide implementation
    protected abstract int abstractMethodWithParams(int a, int b);


    // 3. Concrete Method (Normal method)
    // Can have method body
    public void normalMethod() {
        System.out.println("This is a normal concrete method");
    }


    // 4. Static Method
    // Belongs to class, not object, cannot override, can method hiding
    public static void staticMethod() {
        System.out.println("This is a static method");
    }


    // 5. Final Method
    // Cannot be overridden in subclass
    public final void finalMethod() {
        System.out.println("This is a final method");
    }


    // 6. Protected Method
    // Accessible in same package and subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }


    // 7. Private Method
    // Accessible only inside this class
    // Cannot be overridden
    private void privateMethod() {
        System.out.println("This is a private method");
    }


    // 8. Static Final Method
    // Cannot be overridden and belongs to class
    public static final void staticFinalMethod() {
        System.out.println("This is a static final method");
    }


    /* =========================
       CONSTRUCTOR IN ABSTRACT CLASS
       ========================= */

    // Abstract class CAN have constructor
    // Used when subclass object is created
    public TestAbstractClass() {
        System.out.println("Abstract class constructor called");
    }


    /* =========================
       BLOCKS IN ABSTRACT CLASS
       ========================= */

    // 1. Static Block
    // Runs once when class is loaded
    static {
        System.out.println("Static block in abstract class");
    }

    // 2. Instance Block
    // Runs every time object is created
    {
        System.out.println("Instance block in abstract class");
    }



    /* =========================
       NESTED TYPES IN ABSTRACT CLASS
       ========================= */

    // 1. Static Nested Class
    // Can be accessed without object
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class");
        }
    }

    // 2. Inner Class
    // Requires outer class object
    class InnerClass {
        void show() {
            System.out.println("Inside inner class");
        }
    }



    /* =========================
       DEFAULT METHOD (Not allowed here)
       ========================= */

    // NOTE:
    // default methods are ONLY allowed in interfaces,
    // not in abstract classes.

}

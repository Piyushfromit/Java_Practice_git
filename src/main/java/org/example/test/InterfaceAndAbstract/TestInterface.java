package org.example.test.InterfaceAndAbstract;

// Interface example in Java 17
public interface TestInterface {

    /* =========================
       VARIABLES IN INTERFACE
       ========================= */

    // 1. Constant Variable
    // All variables in interface are:
    // public + static + final (by default)
    int VALUE = 10;

    // Same as writing:
    public static final int MAX_LIMIT = 100;

    // NOTE:
    // Instance variables are NOT allowed in interface
    // private/protected variables are NOT allowed



    /* =========================
       METHODS IN INTERFACE
       ========================= */

    // 1. Abstract Method (Default behavior before Java 8)
    // public and abstract are added automatically
    void abstractMethod();

    // Same as:
    public abstract void anotherAbstractMethod();



    /* =========================
       DEFAULT METHOD (Java 8+)
       ========================= */

    // 2. Default Method
    // Has method body
    // Can be overridden by implementing class
    default void defaultMethod() {
        System.out.println("This is a default method");
    }



    /* =========================
       STATIC METHOD (Java 8+)
       ========================= */

    // 3. Static Method
    // Belongs to interface
    // Called using Interface name
    // Can not override, and also can not hide
    static void staticMethod() {
        System.out.println("This is a static method");
    }



    /* =========================
       PRIVATE METHOD (Java 9+)
       ========================= */

    // 4. Private Method
    // Used internally inside interface
    // Cannot be accessed by implementing classes
    private void privateMethod() {
        System.out.println("This is a private method");

        // Usually used to avoid code duplication
    }



    /* =========================
       PRIVATE STATIC METHOD (Java 9+)
       ========================= */

    // 5. Private Static Method
    // Used inside static methods
    // Cannot be accessed by implementing classes
    private static void privateStaticMethod() {
        System.out.println("Private static helper method");
    }



    /* =========================
       DEFAULT METHOD USING PRIVATE METHOD
       ========================= */

    // Demonstrating private method usage
    default void defaultUsingPrivate() {

        // Calling private method inside interface
        privateMethod();

        System.out.println("Default method calling private method");
    }



    /* =========================
       STATIC METHOD USING PRIVATE STATIC
       ========================= */

    static void staticUsingPrivate() {

        // Calling private static method
        privateStaticMethod();

        System.out.println("Static method calling private static method");
    }



    /* =========================
       NESTED TYPES IN INTERFACE
       ========================= */

    // 6. Nested Interface
    // Automatically public and static
    interface NestedInterface {

        void nestedMethod();
    }



    // 7. Nested Class
    // Automatically public and static
    class NestedClass {

        public void show() {
            System.out.println("Inside nested class");
        }
    }



    /* =========================
       WHAT IS NOT ALLOWED
       ========================= */

    // ❌ Constructor — NOT allowed
    // ❌ Instance block — NOT allowed
    // ❌ Static block — NOT allowed (before Java 8)
    // ❌ Instance variables — NOT allowed
    // ❌ Final methods — NOT allowed
    // ❌ Protected methods — NOT allowed
}
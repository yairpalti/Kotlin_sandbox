package com.example.yair;


/*
This is the JAVA version of the Kotlin Object.
Pros:
-----
Thread safety without synchronization
Easy to implement

Cons:
-----
Early creation of resource that might not be used in the application.
The client application can’t pass any argument, so we can’t reuse it. For example,
having a generic singleton class for database connection where client application supplies database server properties.

Alternative for this are:
* Synchronize the getInstance() method
* synchronized block inside the if loop and volatile variable

https://www.journaldev.com/171/thread-safety-in-java-singleton-classes-with-example-code


Note:  class is loaded only when it is used. In summary, a class is loaded:
* when the new bytecode is executed. For example, SomeClass f = new SomeClass();
* when the bytecodes make a static reference to a class. For example, System.out.
https://www.programcreek.com/2013/01/when-and-how-a-java-class-is-loaded-and-initialized/
 */
public final class SomeSingletonJava {
    public static final SomeSingletonJava INSTANCE;
    public static void display() {
        String var1 = "SomeSingletonJava - display";
        System.out.println(var1);
    }
    static { // called when class is loaded (only one time before the constructor or main method is called.)
        SomeSingletonJava var0 = new SomeSingletonJava();
        INSTANCE = var0;
        String var1 = "SomeSingletonJava - init complete";
        System.out.println(var1);
    }
}

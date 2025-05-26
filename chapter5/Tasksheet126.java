package chapter5;

public class Tasksheet126 {
    public static void main(String[] args) {
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();
        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}

abstract class abstractClass{
    abstract void abstractMethod();
    void concreteMethod(){
        System.out.println("This is a concrete method.");
    }
}

class B extends abstractClass{
    void abstractMethod(){
        System.out.println("B's implementation of abstractMethod");
    }
}

class C extends abstractClass{
    void abstractMethod(){
        System.out.println("C's implementation of abstractMethod");

    }
}

  

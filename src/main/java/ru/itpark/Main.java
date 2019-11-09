package ru.itpark;

public class Main {
    public static void main(String[] args) {
    Utility.helper();

        Utility first = new Utility(){};
        Utility second = new Utility(){};

        System.out.println(first.defaultMethod() == second.defaultMethod());

        final C c = new C();
        c.demo();
    }
}

interface Utility {
    int MAX = 1_000_000;
    static void helper() {
        System.out.println("Hello");
    }
    default Utility defaultMethod(){
        return this;

    }
}



interface A {
    default void demo(){
        System.out.println("A");
    }
    private void print(){
        print();
    }

    default void a1(){
        print();
    }
    default void a2(){
        print();
    }
}
interface B {
    default void demo(){
        System.out.println("B");
    }
}

class P {
    private void demo() {
        System.out.println("P");
    }
}
class  C extends P implements A,B {
    @Override
    public void demo() {
        A.super.demo();
        B.super.demo();
    }
}

package com.company;

class A{
    public void method1(){
        System.out.println("Iam method 1 of class A");
    }

    public void method2(){
        System.out.println("Iam method 2 of class A");
    }
}

class B extends A{
    @Override
    public void method2(){
        System.out.println("Iam method 2 of class B");
    }
}

public class J15_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        a.method2();

        B b = new B();
        b.method1();
        b.method2();
    }
}

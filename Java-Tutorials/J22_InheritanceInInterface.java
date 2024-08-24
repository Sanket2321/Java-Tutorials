package com.company;

interface ParentInterface{
    void meth1();
}

interface ChildInterface extends ParentInterface{
    void meth2();
}

class MyMainClass implements ChildInterface{
    @Override
    public void meth1() {
        System.out.println("Iam method 1");
    }
    @Override
    public void meth2() {
        System.out.println("Iam method 2");
    }
}

public class J22_InheritanceInInterface {
    public static void main(String[] args) {
        MyMainClass m = new MyMainClass();
        m.meth1();
        m.meth2();
    }
}

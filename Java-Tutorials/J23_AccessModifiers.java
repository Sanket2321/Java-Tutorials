package com.company;

/*
            Same    Same
Modifier    Class   Package   Subclass   World
public       yes      yes       yes       yes
protected    yes      yes       yes       no
Default      yes      yes       no        no
private      yes      no        no        no
*/

class TestClass{
    public int x=10;
    protected int y=10;
    int z=10;
    private int a=10;

    public void meth(){
        System.out.println(a); //private can be used only in same class
    }
}

public class J23_AccessModifiers {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        System.out.println(t.x);
        System.out.println(t.y);
        System.out.println(t.z);
        //System.out.println(t.a); ->private var cannot be used in the same package
    }
}

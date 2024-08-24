package com.company;

class Myclass{
    public static void staticmeth(){
        System.out.println("Hello iam a static method");
    }

    public void nonstaticmeth(){
        System.out.println("Hello iam a non-static method");
    }
}

public class J17_Static_NonStatic {
    public static void main(String[] args) {

        //Static methods can be accessed by without making the instance(object) of the class.
        //Means it can be directly called by referencing the class directly rather than the object.
        Myclass.staticmeth();

        //Non static methods can be accessed only by making the instance(object) of the class.
        //They cannot be directly accessed by referencing the class.
        Myclass myclass = new Myclass();
        myclass.nonstaticmeth();

    }
}

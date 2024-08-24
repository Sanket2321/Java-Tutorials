package com.company;

public class J07_MethodOverloading {

    /*
    There are 3 ways to perform method overloading in java
    1st is to by changing the return type of the method
    2nd is to by changing the no of args of the method
    3rd is to by changing the datatype of the args
    */

    //1.By changing the return type
    static int foo(int x,int y){
        return (x+y);
    }
    static double foo(double a,double b){
        return (a+b);
    }

    //2.By changing the no of args
    static void bar(int x,int y){
        System.out.println(x+y);
    }
    static void bar(int x,int y,int z){
        System.out.println(x+y+z);
    }

    //3.By changing the datatype of the args
    static void add(int x,int y){
        System.out.println(x+y);
    }
    static void add(float x,float y){
        System.out.println(x+y);
    }


    public static void main(String[] args) {
        System.out.println(foo(5,2));
        System.out.println(foo(5.1d,5.2d));

        bar(5,2);
        bar(5,2,3);

        add(5,8);
        add(5.2f,5.6f);
    }

}

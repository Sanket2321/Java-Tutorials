package com.company;

public class J06_Methods {

    /*
    Java program consists of a source file which contains one or many classes.
    A class contains one or many methods and a method contains a set of statements.

    Source_file -> Class -> Method

    Java program may contain many classes and many methods but there needs to be at
    least one main() method inside any of the class.Not each class must have a main
    method.

    A method is function written inside a java class which can be accessed by calling
    it in the main function.
    */

    static int staticCalMethod(int x,int y){
        int z = x+y;
        return z;
    }

    int notStaticCalMethod(int a,int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {

        //printing using static method
        System.out.println(staticCalMethod(5,3));

        //printing using non-static method
        J06_Methods obj = new J06_Methods();                  //creates a new obj of this class file
        System.out.println(obj.notStaticCalMethod(5,3)); //call the mentioned method from created obj of the class

    }
}

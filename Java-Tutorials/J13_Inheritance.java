package com.company;


/*
This is a superclass or a base class.All the properties of this class can be accessed
by the objects of the class which is inherited form this class.But this class object cant
access the properties of the subclass.
*/
class Superclass{
    int x;

    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
}


/*
This is a subclass.This class objects cn access the properties from the superclass as
well as the properties of self.Java does'nt support multiple inheritance.
*/
class SubClass extends Superclass{
    int y;

    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }
}


/*
Inheritance is the borrowing of the properties(variables,methods,attributes) from
the existing class to the sub class.
*/
public class J13_Inheritance {
    public static void main(String[] args) {
        Superclass s1 = new Superclass();
        s1.setX(5);
        System.out.println(s1.getX());

        SubClass sb1 = new SubClass();
        sb1.setX(9);
        sb1.setY(8);
        System.out.println(sb1.getX());
        System.out.println(sb1.getY());
    }
}

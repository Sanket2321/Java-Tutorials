package com.company;

/*
A Java abstract class is a class that can't be instantiated. That means you cannot create new
instances(objects) of an abstract class. It works as a base for subclasses.But it is possible to
create an reference of an abstract class(i.e we can assign reference of abstract class to object
of concrete the concrete class).

Concrete classes are the classes which can be instantiated.

Abstract class can have abstract and non-abstract methods both, but if a abstract method is declared
inside the class then the class must be abstract.

Means abstract methods can be only created in abstract classes.

Also the abstract methods are not implemented(without body) but are only defined.Only its overridden
methods are implemented.

Why And When To Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.
*/
abstract class Food{
    abstract void eat(); //--> this method is defined but not implemented

    public void digest(){
        System.out.println("This food is being digested...");
    }
}

/*
Conditions of abstract classes and methods :

1)If the subclass inherits from a abstract superclass, then it must override all the abstract methods
present in the abstract superclass.

2)The scope of the abstract method and the overridden method must be same.

3)Abstract methods must be in abstract classes only.
*/
class Pizza extends Food{
    @Override
    void eat(){
        System.out.println("This pizza tastes great");
    }
}

class Burger extends Food{
    @Override
    void eat(){
        System.out.println("This burger tastes great");
    }
}

public class J19_AbstractClasses {
    public static void main(String[] args) {

        //Food myfood = new Food(); --> throws an error
        Food myPizza = new Pizza();
        Food myBurger = new Burger();

        myPizza.eat();
        myPizza.digest();

        myBurger.eat();
        myBurger.digest();

    }
}

package com.company;

class Animals{
    int legs = 4;

    public void walk(){
        System.out.println("Walking....");
    }

    public void run(){
        System.out.println("Running....");
    }
}

class Dog extends Animals{
    public void bark(){
        System.out.println("Barking...");
    }
}

class Cat extends Animals{
    public void drink(){
        System.out.println("Drinking milk");
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        Cat c1 = new Cat();
        Cat c2 = new Cat();

        System.out.println("This is dog1");
        d1.walk();
        d1.run();
        d1.bark();

        System.out.println("This is dog2");
        d2.walk();
        d2.run();
        d2.bark();

        System.out.println("This is cat1");
        c1.run();
        c1.run();
        c1.drink();

        System.out.println("This is cat2");
        c2.run();
        c2.run();
        c2.drink();

    }
}

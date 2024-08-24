package com.company;

/*
Just like a class in java is a collection of the related methods,an interface in java is a
collection of abstract methods.

All the methods inside an interface must have empty bodies except default methods and
static methods.On implementation of an interface, you must override all of its methods.

Interface methods are by default abstract and public,Interface attributes are by default public,
static and final.

An interface cannot contain a constructor (as it cannot be used to create objects).

All the methods implemented from the interface must be public.
*/

interface Vehicle{
    int speed=10;
    void accelerate(int x);
    void brake(int y);
}

class Bicycle{
    public void blowHorn(){
        System.out.println("Blowing horn");
    }
}

class ElectricBicycle extends Bicycle implements Vehicle{
    public void accelerate(int x){
        System.out.println("Accelerating...");
    }
    public void brake(int y){
        System.out.println("applying brakes...");
    }
    public void charge(){
        System.out.println("Charging bicycle");
    }
}

public class J20_Interface {
    public static void main(String[] args) {
        ElectricBicycle bicycle = new ElectricBicycle();
        bicycle.accelerate(5);
        bicycle.brake(6);
        bicycle.charge();
        bicycle.blowHorn();

        //bicycle.speed=20; ->Cannot modify the attributes of interface as they are final
    }
}

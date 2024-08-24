package com.company;

class CarsDetails{
    String name;
    int modelYear;
    int price;

    public void printDetails(){
        System.out.println(name+" "+modelYear+" "+price);
    }

    //Constructor
    /*
    It is a special type of method which is used to initialize the object.
    It is declared inside the class itself.Constructors are used to set initial values to the
    attributes of the object.
    */
    CarsDetails(String n,int y,int p){
        name=n;
        modelYear=y;
        price=p;
    }

    //Overloading constructors
    /*
    Constructors can be overloaded same like a method is overloaded
    */
    CarsDetails(int y,int p){
        modelYear=y;
        price=p;
    }

    CarsDetails(){
        name="Default name";
    }

}


public class J12_Constructor {
    public static void main(String[] args) {

        CarsDetails c1 = new CarsDetails("mustang",1969,600000);
        CarsDetails c2 = new CarsDetails("swift",2009,500000);
        CarsDetails c3 = new CarsDetails("polo",2013,700000);
        CarsDetails c4 = new CarsDetails(2000,1000000);
        CarsDetails c5 = new CarsDetails();
        c1.printDetails();
        c2.printDetails();
        c3.printDetails();
        c4.printDetails();
        c5.printDetails();

        //later after initializing we can change the properties
        c1.name="lexus";
        c1.printDetails();

    }
}

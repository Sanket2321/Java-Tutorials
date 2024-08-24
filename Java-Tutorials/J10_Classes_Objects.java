package com.company;
import java.util.Scanner;

//Custom Class
class Employee {
    Scanner sc = new Scanner(System.in);

    int id;
    int salary;
    int experience;
    String name;

    public void setDetails(){
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter experience");
        experience = sc.nextInt();
        System.out.println("enter salary");
        salary = sc.nextInt();
    }

    public void printDetails(){
        System.out.println("ur id is "+id);
        System.out.println("ur name is "+name);
        System.out.println("ur experience is "+experience);
        System.out.println("ur salary is "+salary);
    }
}

//square class
class square{
    int x;

    public int area(){
        return (x*x);
    }

    public int perimeter(){
        return (x*4);
    }
}

//Main Class
public class J10_Classes_Objects {

    public static void main(String[] args) {

        //Get details from employee class
        /*
        //instantiating the objects from the class
        Employee emply1 = new Employee();
        Employee emply2 = new Employee();

        emply1.id = 01;
        emply2.id = 02;
        emply1.setDetails();
        emply2.setDetails();

        emply1.printDetails();
        emply2.printDetails();
        */

        //To print area and perimeter of sq
        /*
        square s1 = new square();
        s1.x = 5;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
        */

    }
}

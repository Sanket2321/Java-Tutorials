package com.company;
import java.util.Scanner;

public class J01_Basics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //Print_statement
        System.out.println("hello");  //create a new line on the screen after outputting a value
        System.out.print("world");    //does'nt create a new line
        System.out.println("!");


        // Primitive Data Types
        byte age = 18;
        short a = 8;
        int b = 3608;
        long c = 8745624885L;
        float d = 99.45f;
        double e = 99.45461225879d;
        char f = 'F';
        String str = "Hello";
        System.out.println(str);
        System.out.println(f);
        System.out.println(age);


        //Taking input
        Scanner s = new Scanner(System.in);
        System.out.println("enter num 1");
        int n1 = s.nextInt();
        System.out.println("Enter num 2");
        int n2 = s.nextInt();
        int sum = n1+n2;
        System.out.println("sum is : " + sum);
        System.out.println("Enter a sentence ");
        String sen = s.nextLine();
        System.out.println("sentence is " + sen);


        //Program to cal %
        /*
        If we want the output specific in floating digit
        then take input values as a float only,taking as int will not work
        */
        System.out.println("Enter sub1 marks ");
        float sub1 = scanner.nextFloat();
        System.out.println("Enter sub2 marks ");
        float sub2 = scanner.nextFloat();
        System.out.println("Enter sub3 marks ");
        float sub3 = scanner.nextFloat();
        float totalmarks = (sub1+sub2+sub3);
        float percentage = ((totalmarks/300)*100);
        System.out.println("Your percentage is " + percentage);


        //Precedence and Associativity
        /* The * / have higher precedence than the +- operator so the * /
        will be executed first and the +-.But * / or +- have the same
        precedence so associativity is then used. Associativity for * / or +-
        is from left to right.
        */
        int n11 = 6*5-2;
        System.out.println(n1);   //30-2 = 28 precedence higher for *
        int n21 = 6*5/3;
        System.out.println(n2);   //30/3 = 10 associativity is from L toR
        int n3 = 60/5*3;
        System.out.println(n3);   //12*3 = 36


        //Increment Decrement
        int x = 5;
        int y = x++;              //y is assigned value of x(5) and then incremented by 1
        System.out.println(y);    //y is 5 and now x is 6
        int z = ++x;              //x(6) is incremented by 1 and then z is assigned value of x(7)
        System.out.println(z);    //z is  7 and x is 7

        char A = 'a';
        System.out.println(A++);  //prints a and then gets incremented to b
        System.out.println(A);    //now char A = b
        System.out.println(++A);  //now char A = b is incremented to c and then char A = c gets printed


        //Type casting
        /* Widening_casting(done automatically) - converting a smaller type to a larger type size
        eg - byte-short-int-long-float-double
        Narrowing_casting(done_manually) - converting a larger type to a smaller size type
        eg - double-float-long-int-short-byte
        */
        byte myByte = 8;
        int myInt = myByte;
        System.out.println(myByte); //outputs 8
        System.out.println(myInt);  //outputs 8

        double myD= 85.6789;
        short myShort = (short) myD;
        System.out.println(myD);      //outputs 85.6789
        System.out.println(myShort);  //outputs 85


    }
}

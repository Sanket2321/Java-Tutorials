package com.company;

public class J04_Loops {
    public static void main(String[] args) {

        //while - checks the condition and then executes the code
        /*
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        */

        //do while - executes the code at least once and the check the condition
        /*
        int j = 10;
        do{
            System.out.println(j);
        }while(j<5);
        */

        //for loop
        /*
        for(int i1 = 0; i1<=10; i1++){
            System.out.println(i1);
        }
        */

        //program to print first n even numbers
        /*
        int n = 5;
        for(int i=0;i<n;i++){
            System.out.println(2*i);
        }
        */

        //program to print first n odd numbers
        /*
        int n = 5;
        for(int j=0;j<n;j++){
            System.out.println(2*j+1);
        }
        */

        //program to print first n natural numbs in reverse order
        /*
        int n = 10;
        for(int i=n;i>=0;i--){
            System.out.println(i);
        }
        */

        //program to print first n even numbers in reverse order
        /*
        int n = 5;
        for(int i=n;i>0;i--){
            System.out.println(2*i);
        }
        */

        //program to print first n odd numbers in reverse
        /*
        int n = 5;
        for(int i=n-1;i>=0;i--){
            System.out.println(2*i+1);
        }
        */

        //continue statement - skips all the lines of code below it
        /*
        for(int i=0;i<5;i++){
            if(i==3){
                System.out.println("Skipping 3");
                continue;
            }
            System.out.println(i);
            System.out.println("Hello");
        }
        */

        //half pyramid
        /*
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        */

        //inverted half pyramid
        /*
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        //solid rectangle
        /*
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        */

        //hollow rectangle
        /*
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i==1 || j==1 || i==5 || j==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */


        //to print table of number
        /*
        int n = 7;
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
        */

        //to print table of number in reverse
        /*
        int n = 7;
        for(int i=10;i>=1;i--){
            System.out.println(i*n);
        }
        */

        //print the factorial
        /*
        int n=5;
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
        */


    }
}

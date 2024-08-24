package com.company;
import  java.util.Scanner;

public class J03_Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //if-else
        int age = 19;
        if(age>18){
            System.out.println("u can drive"); //gets executed if condition is true
        }else{
            System.out.println("u cant drive"); //gets executed if conditions is false
        }
        String canDrive = (age>18) ? "u can drive" : "u cant drive";
        System.out.println(canDrive);


        //switch-case
        int var = 4;  //var can be int char or a string
        switch(var){
            case 1:
                System.out.println("option 1 selected");
                break;
            case 2:
                System.out.println("option 2 is selected");
                break;
            case 3:
                System.out.println("option 3 is selected");
                break;
            case 4:
                System.out.println("option 4 is selected");
                break;
            default:
                System.out.println("default is selected");
                break;
        }


        //problem1
        byte sub1,sub2,sub3;
        float total;
        System.out.println("enter sub1 marks");
        sub1 =  sc.nextByte();
        System.out.println("enter sub2 marks");
        sub2 =  sc.nextByte();
        System.out.println("enter sub3 marks");
        sub3 =  sc.nextByte();
        total = (sub1+sub2+sub3)/3.0f;

        if(sub1<33){
            System.out.println("u r fail");
        }else if (sub2<33){
            System.out.println("u r fail");
        }else if(sub3<33){
            System.out.println("u r fail");
        }else if(total<40.0f){
            System.out.println("u r fail");
        }else{
            System.out.println("u r passed");
        }

        //this is the efficient way to solve the same prob in less lines of code
        if(sub1>33 && sub2>33 && sub3>33 && total>40){
            System.out.println("u r passed");
        }
        else{
            System.out.println("u r failed");
        }


        //problem2
        System.out.println("enter your income amt in rupees");
        long rupee = sc.nextLong();
        float it;
        if(rupee<250000){
            System.out.println("no need to pay it");
        }else if(rupee>250000 && rupee<500000){
            it = (float)0.05 * rupee;
            System.out.println("need to pay " + it);
        }
        else if(rupee>500000 && rupee<1000000){
            it = (float)0.2 * rupee;
            System.out.println("need to pay " + it);
        }
        else if(rupee>100000){
            it = (float)0.3 * rupee;
            System.out.println("need to pay " + it);
        }


        //problem3
        System.out.println("enter website");
        String ws = sc.next();
        if(ws.endsWith(".com")){
            System.out.println("its commercial website");
        }else if(ws.endsWith(".org")){
            System.out.println("its organizations website");
        }else if(ws.endsWith(".in")){
            System.out.println("its indian website");
        }else {
            System.out.println("its not an website");
        }
    }
}

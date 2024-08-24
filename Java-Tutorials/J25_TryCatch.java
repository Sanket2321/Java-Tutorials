package com.company;
import java.util.Scanner;

/*
Compile time errors are occurred during the compling of the program
Runtime errors are occurred when the program runs,even if it is compiled successfully
it may give runtime errors.
*/

/*
Try catch is used to handle runtime errors.The try block will try to execute the line
of code inside it,but if an exception(error) occurs then the code inside catch will be
executed.
*/


public class J25_TryCatch {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int a = 100;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("We ran into a problem : ");
            System.out.println(e);
        }
        System.out.println("program executed successfully");


        int[] arr = {3,1,2};
        int i = sc.nextInt();
        try{
            System.out.println(arr[i]/2);
        }catch(ArithmeticException e){
            System.out.println("Some arithmetic exception occurred : "+e); //will catch arithmetic exception
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Some array exception occurred : "+e);      //will catch array index error
        }catch(Exception e){
            System.out.println("Some other exception occurred : "+e);      //will catch other errors
        }

    }
}

package com.company;
import java.util.Scanner;

/*
We can create a custom checked exception by extending a class as Exception.
By default, the constructor is executed if the toString and getMessage is not
provided.If the toString and getMessage is defined then toString will get
executed, else if getMessage is defined then it will get executed,else if
no method is defined then the constructor will get executed.
*/

class mycustomException extends Exception{

    mycustomException(String str){
        super(str);
    }

    @Override
    public String toString() {
        return "Enter +ve num";
    }

    @Override
    public String getMessage() {
        return "enter +ve num";
    }
}


/*
To throw a custom exception we need to use the throw keyword and then handle
that exception with a try catch statement.
*/
public class J26_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
            if(a<0){
                throw new mycustomException("+ve num");
            }
        }catch (mycustomException e){
            System.out.println(e);
        }
    }
}

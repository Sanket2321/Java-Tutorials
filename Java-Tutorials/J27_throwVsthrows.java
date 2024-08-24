package com.company;


/*
The throw keyword is used to throw an error to the user and the throw statement need to
be surrounded by a try and catch statement.
The throws keyword tells the user that the method may throw an exception which needs to be
handled while calling of the method.
*/
class customClass {

    static int x=-5;

    public static void myThrow(){
        try {
            if (x < 0) {
                throw new Exception("Enter +ve num");
            }else{
                System.out.println("In a try block");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Executed successfully");
    }

    public static void myThrows() throws Exception{
        if (x < 0) {
            throw new Exception("Enter positive num");
        }
    }

}

public class J27_throwVsthrows {
    public static void main(String[] args){

        //no need to use try-catch as its handle in the method itself
        customClass.myThrow();

        //need to surround it with try-catch as it is not handled
        try{
            customClass.myThrows();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}

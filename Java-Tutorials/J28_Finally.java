package com.company;

class Greet{
    static int a=50;
    static int b=0;
    static int c;
    public static int divi(){
        try{
           c=a/b;
           return c;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("This will get executed even if the exception occurs or not");
        }
        return 0;
    }
}

public class J28_Finally {
    public static void main(String[] args) {
        System.out.println(Greet.divi());
    }
}

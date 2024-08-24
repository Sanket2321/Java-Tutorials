package com.company;

public class J09_Recursion {

    /*
    Calling of a function by itself or calling the function inside the same
    same function is recursion.

    for example - x=6 then
    = 6 * fact(5)
    = 6 * 5 * fact(4)
    = 6 * 5 * 4 * fact(3)
    = 6 * 5 * 4 * 3 * fact(2)
    = 6 * 5 * 4 * 3 * 2 * 1
    = 120
    */
    static int fact(int x){

        if(x==0 || x==1){
           return 1;
        }else{
            return (x * fact(x-1));
        }

    }


    //sum of n natural numbs using recursion
    static int sum(int n){
        if(n==0){
            return 0;
        }else{
            return n + sum(n-1);
        }
    }


    /*
    pattern using recursion
    for example - n=3 then
    patternRec(3)
    patternRec(2) + 3 times * and then newline
    patternRec(1) + 2 times * and then newline + 3 times * and then newline
    patternRec(0) + 1 times * and then newline + 2 times * and then newline + 3 times * and then newline
    */
    static void patternRec(int n){
        if(n>0){
            patternRec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

}

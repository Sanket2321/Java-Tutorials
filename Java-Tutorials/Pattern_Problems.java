package com.company;

public class Pattern_Problems {

    /*
    static void pattern(int n){
        for(int i=0;i<=n;i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */


    /*
    static void pattern1(int n){
        for(int i=n;i>=0;i--) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */


    /*
    static int sum(int n){
        if(n==0){
            return 0;
        }else{
            return n + sum(n-1);
        }
    }
    */

    /*
    //print avg of given arguments
    static float avg(float ...arr){
        float sum=0;
        for(float i:arr){
            sum = sum+i;
        }
        return sum/arr.length;
    }
    */

    //pattern using recursion
    /*
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
        patternRec(5);
        }


}

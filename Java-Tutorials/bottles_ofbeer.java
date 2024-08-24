package com.company.problems;

public class bottles_ofbeer {
    public static void main(String[] args){

        /*
        int numOfBottles = 99;

        while(numOfBottles>0){

            if(numOfBottles == 1){
                System.out.println(numOfBottles + " bottle of beer on the wall");
                System.out.println(numOfBottles + " bottle of beer");
                System.out.println("take one down and pass it around!");
                numOfBottles = numOfBottles - 1;
                System.out.println(numOfBottles + " bottles of beer on the wall!");
                System.out.println();
            }else {
                System.out.println(numOfBottles + " bottles of beer on the wall");
                System.out.println(numOfBottles + " bottles of beer");
                System.out.println("take one down and pass it around!");
                numOfBottles = numOfBottles - 1;
                if(numOfBottles == 1) {
                    System.out.println(numOfBottles + " bottle of beer on the wall!");
                    System.out.println();
                }else{
                    System.out.println(numOfBottles + " bottles of beer on the wall!");
                    System.out.println();
                }
            }
        }
        */

        int bottles = 99;
        String word = " bottles";

        while(bottles>0){

            if(bottles == 1){
                word = " bottle";
            }

            System.out.println(bottles + word + " of beer on the wall");
            System.out.println(bottles + word + " of beer");
            System.out.println("take one down and pass it around!");
            bottles = bottles - 1;

            if(bottles>0 && bottles != 1) {
                System.out.println(bottles + word + " of beer on the wall!");
                System.out.println();
            }else if(bottles==1){
                word = " bottle";
                System.out.println(bottles + word + " of beer on the wall!");
                System.out.println();
            }
            else{
                System.out.println("no more bottles of beer on the wall!");
            }
        }
    }
}

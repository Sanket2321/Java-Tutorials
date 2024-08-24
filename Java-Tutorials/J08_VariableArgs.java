package com.company;

public class J08_VariableArgs {

    /*
    This below method is able to take only 2 arguments, if given a 3rd then
    it will produce an error
    */
    static int sum(int x,int y){
        return(x+y);
    }


    /*
    Below method can take min 0 and max any number of arguments and store them in a array
    */
    static int sum1(int ...arr){
        int result = 0;
        for(int i : arr){
            result+=i;
        }
        return result;
    }


    /*
    Below method will compulsorily take min 1 arg and can take max any args.
    */
    static int sum2(int x,int ...arr){
        int result = x;
        for(int i : arr){
            result +=i;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(sum(5,2));
        System.out.println(sum2(5,5,1,9,2,3,4,5,6,8,7,9));
        System.out.println(sum1(5,3,5,9,6));
        System.out.println(sum1());
    }
}

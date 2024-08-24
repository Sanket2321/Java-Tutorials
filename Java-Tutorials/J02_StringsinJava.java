package com.company;
import java.util.Scanner;

public class J02_StringsinJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Strings
        /* Strings are immutable and cannot be changed.Strings are class like scanner class,
        but can be used as a data type */
        //Returns true bcz its referencing the same object present in the string constant pool
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);
        //Returns false bcz str1 and str2 are 2 different string objects
        String str1 = new String("hi");
        String str2 = new String("hi");
        System.out.println(str1==str2);


        //Different ways to print in java
        int a = 5;
        float b = 5.6f;
        System.out.print("");  //no new line at end
        System.out.println("");  //prints new line at end
        System.out.printf("a is %d and b is %f",a,b); //%d for int %f for float %c for char %s for str
        System.out.format("");  //same like System.out.printf


        //Different methods in string
        String name = "Abhishek";
        System.out.println(name);
        System.out.println(name.toLowerCase());  //original string is not changed,but a new string is returned.
        System.out.println(name.toUpperCase());  //returns string in uppercase

        String nonTrimmed = " Abhishek ";
        System.out.println(nonTrimmed);
        String trimmedStr = nonTrimmed.trim();  //trims all the space at start and end
        System.out.println(trimmedStr);

        System.out.println(name.substring(3)); //returns substring start index(4) to end index,start/end index is included
        System.out.println(name.substring(3,6)); //returns substring start index(4) to end index,start included end not

        System.out.println(name.replace('i','e'));  //replace oldchar with newchar
        System.out.println(name.replace("shek","jeet"));  //replace oldstr with newstr

        System.out.println(name.startsWith("Ab"));  //returns true if starts with given string
        System.out.println(name.endsWith("ek"));  //returns true if ends with given string

        System.out.println(name.charAt(2));  //returns the char at the given index
        System.out.println(name.indexOf("hi"));  //returns the index of given string

        System.out.println(name.equals("abhishek"));  //returns false bcz string is case sensitive
        System.out.println(name.equalsIgnoreCase("aBHishek"));  //ignores the case

        //escape sequences
        System.out.println("double quote \" backslash \\ newline \n tab\t");

    }
}

package com.company;
import java.util.ArrayList;

public class J24_ArrayList {
    public static void main(String[] args) {

        /*
        Once an array is declared it cannot be changed ,i.e new elements cannot be added to the array
        only the existing elements can be replaced.
        */

        int[] myarray = {1,2,3};
        myarray[0] = 0;
        //myarray[3] = 5; -> will throw error bcz the array is a kind of immutable(unable to change) type


        /*
        Arraylist is an array which is dynamic,i.e it can be updated or new elements can be added to it.
        elements can be added and removed or updated dynamically.
        The difference between a built-in array and an ArrayList in Java, is that the size of an array
        cannot be modified (if you want to add or remove elements to/from an array, you have to create
        a new one).While elements can be added and removed from an ArrayList whenever you want.
        */

        ArrayList<String> myarraylist = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();

        myarraylist.add("Usa");                 //will append the elements at the end
        myarraylist.add("India");
        myarraylist.add("UK");
        myarraylist.get(1);                     //returns the element at the given index
        myarraylist.set(2,"Russia");            //to modify the element
        myarraylist.remove(1);            //remove element from given index
        myarraylist.size();//returns the size
        myarraylist.add(2,"China"); //will add element at 2nd index and pushes rest elements down

        for (String s: myarraylist) {
            System.out.println(s);
        }

        l2.add("Canada");
        l2.add("Brazil");
        myarraylist.addAll(l2);  //appends another list of same type



        //2D arraylist
        ArrayList<ArrayList<String>> groceryL = new ArrayList<>();
        ArrayList<String> drinksL = new ArrayList<>();
        ArrayList<String> veggiesL = new ArrayList<>();
        ArrayList<String> mreL = new ArrayList<>();

        mreL.add("pizza");
        mreL.add("pasta");
        mreL.add("burger");

        veggiesL.add("tomatos");
        veggiesL.add("potatos");

        drinksL.add("soda");
        drinksL.add("coffee");

        groceryL.add(mreL);
        groceryL.add(drinksL);
        groceryL.add(veggiesL);

        for(int i=0;i<groceryL.size();i++){
            System.out.println(groceryL.get(i));
        }

    }
}

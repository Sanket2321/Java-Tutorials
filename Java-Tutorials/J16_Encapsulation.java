package com.company;

class Player{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

/*
Encapsulation is used to protect the users private data by using access modifiers.
The data can be accessed by using getters and setters.
*/
public class J16_Encapsulation {
    public static void main(String[] args) {
        Player player1 = new Player();
        // player1.name="John"; - throws an error
        // System.out.println(player1.name); - throws an error

        player1.setName("John");
        player1.setAge(18);
        System.out.println(player1.getName()+" "+player1.getAge());
    }
}

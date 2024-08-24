package com.company;

class Cars {
    private int price;
    private String name;

    public void setPrice(int x){
        price = x;
    }
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}

public class J11_GetterSetter {
    public static void main(String[] args) {

        Cars c1 = new Cars();
        c1.setName("swift");
        c1.setPrice(500000);
        System.out.println(c1.getName() + c1.getPrice());

        Cars c2 = new Cars();
        c2.setName("polo");
        c2.setPrice(600000);
        System.out.println(c2.getName() + c2.getPrice());

    }
}

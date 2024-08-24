package com.company;

class rectangle{
    private int length;
    private int breadth;

    public void setLength(int l){
        this.length=l;
    }
    public void setBreadth(int b){
        this.breadth=b;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }

}

class rectangle1{
    private int length;
    private int breadth;

    rectangle1(int l,int b){
        this.length=l;
        this.breadth=b;
    }

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

public class ProblemsOnClasses {
    public static void main(String[] args) {

        //using getters and setters
        rectangle r1 = new rectangle();
        r1.setLength(5);
        r1.setBreadth(6);
        System.out.println("Length and breadth is : "+r1.getLength()+" "+r1.getBreadth());
        System.out.println("Area is : " + r1.area());
        System.out.println("Perimeter is : " + r1.perimeter());

        //using constructor
        rectangle1 r = new rectangle1(8,6);
        System.out.println("Length and breadth is : "+r.getLength()+" "+r.getBreadth());
        System.out.println("Area is : " + r.area());
        System.out.println("Perimeter is : " + r.perimeter());

    }
}

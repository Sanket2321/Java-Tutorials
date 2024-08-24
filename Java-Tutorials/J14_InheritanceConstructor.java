package com.company;

class Base{
    Base(){
        System.out.println("Iam a constructor of base class");
    }
    Base(int x){
        System.out.println("Iam a constructor of base class with value of x as "+x);
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("Iam a constructor of derived class");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("Iam a constructor of derived class with value of  y as "+y);
    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("Iam a constructor of child of derived class");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("Iam a constructor of child of derived class with value of z as "+z);
    }
}

public class J14_InheritanceConstructor {
    public static void main(String[] args) {
        Base b1 = new Base();
        Derived d1 = new Derived();
        ChildOfDerived c1 = new ChildOfDerived();

        for(int i=0;i<80;i++){
            System.out.print("-");
        }
        System.out.println();

        Base b2 = new Base(1);
        Derived d2 = new Derived(1,2);
        ChildOfDerived c2 = new ChildOfDerived(1,2,3);

    }
}

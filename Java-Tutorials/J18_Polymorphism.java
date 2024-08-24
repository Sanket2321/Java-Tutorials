package com.company;

class Banks {
    public void rates() {
        System.out.println("Interest rate is ");
    }
}

class Sbi extends Banks {
    public void rates() {
        System.out.println("Interest rate is 5%");
    }
}

class Axis extends Banks {
    public void rates() {
        System.out.println("Interest rate is 7%");
    }
}

class Icici extends Banks {
    public void rates() {
        System.out.println("Interest rate is 9%");
    }
}

class Citi extends Banks {
    public void rates() {
        System.out.println("Interest rate is 11%");
    }
}

public class J18_Polymorphism {
    public static void main(String[] args) {
        Banks bank1 = new Sbi();
        Banks bank2 = new Icici();
        Banks bank3 = new Citi();

        bank1.rates();
        bank2.rates();
        bank3.rates();

        // Gives the same results
        Banks[] myBanks = new Banks[3];
        myBanks[0] = new Sbi();
        myBanks[1] = new Icici();
        myBanks[2] = new Citi();

        for (int i = 0; i < 3; i++) {
            myBanks[i].rates();
        }
    }
}

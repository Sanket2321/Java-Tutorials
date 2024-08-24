package com.company;

/*
Multiple inheritance when there exist methods with same signature in both the superclasses
To avoid this java supports multiple interface.
*/
class Cellphone{
    public void Call(){
        System.out.println("Calling a number...");
    }
    public void Message(){
        System.out.println("Sending message...");
    }
}

interface Music{
    void playMusic();
}

interface Camera{
    void clickPic();
}

class SmartPhone extends Cellphone implements Music,Camera{
    public void playMusic(){
        System.out.println("Playing music...");
    }
    public void clickPic(){
        System.out.println("Clicking picture...");
    }
}

public class J21_MultipleInterface {
    public static void main(String[] args) {
        SmartPhone note9 = new SmartPhone();
        note9.Call();
        note9.Message();
        note9.playMusic();
        note9.clickPic();

        //Polymorphism
        Camera myMobCam = new SmartPhone(); //Can use methods only from Camera
        myMobCam.clickPic();
        //myMobCam.playMusic(); --> not able to use methods of other interface/classes

        Music myMobmp3 = new SmartPhone();
        myMobmp3.playMusic();
    }
}

package com.example.atitude6430.injectionswithgit;

/**
 * Created by Atitude6430 on 2016-01-08.
 */
public class Motor {
    private int speed;
    public Motor (){
        this.speed = 0;
    }

    public int getSpeed(){
        return  speed;
    }
    public void accelerate (int value){
        speed+=speed;
    }
    public void brake(){
        speed = 0;
    }
}

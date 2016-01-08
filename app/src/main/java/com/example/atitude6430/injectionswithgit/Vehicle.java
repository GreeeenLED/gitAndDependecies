package com.example.atitude6430.injectionswithgit;

import javax.inject.Inject;

/**
 * Created by Atitude6430 on 2016-01-08.
 */
public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle (Motor motor){
        this.motor = motor;
    }
    public void IncreaseSpeed(int value){
        motor.accelerate(value);
    }
    public void Stop(){
        motor.brake();
    }
    public int GetSpeed(){
        return motor.getSpeed();
    }
}

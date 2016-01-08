package com.example.atitude6430.injectionswithgit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Atitude6430 on 2016-01-08.
 */

//klasa do definiowania obiektów
@Module
public class ModuleClass {
    @Provides
    @Singleton
    Motor provideMotor(){
        return new Motor();
    }
    @Provides
    @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}

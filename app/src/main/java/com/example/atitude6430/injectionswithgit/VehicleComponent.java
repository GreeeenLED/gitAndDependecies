package com.example.atitude6430.injectionswithgit;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by Atitude6430 on 2016-01-08.
 */
@Singleton
@Component (modules = {ModuleClass.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}

package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Cropduster extends Aircraft implements FarmVehicle {

    public String fertilize(CropRow cropRow){
        return Cropduster.class.getSimpleName() + " fertilized the " + cropRow.getClass().getSimpleName() + "!";
    }

    public String operate() {
        return "Ready to work on the Farm!";
    }

    public String makeNoise() {
        return "Engine roars";
    }

    public String fly() {
        return "Soars above the Farm";
    }
}

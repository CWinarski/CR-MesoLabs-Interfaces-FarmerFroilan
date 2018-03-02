package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Cropduster extends Aircraft implements FarmVehicle {

    public boolean fertilize(CropRow cropRow){
        return false;
    }

    public String operate(Vehicle vehicle) {
        return null;
    }

    public String makeNoise() {
        return null;
    }
}

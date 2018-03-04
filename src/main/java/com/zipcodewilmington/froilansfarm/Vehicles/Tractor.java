package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {
    public String operate() {
        return "Ready to work on the Farm!";
    }

    public String makeNoise() {
        return "Engine splutters";
    }

    public Edible harvest(Crop crop){
        //remove crop from row
        //return edible then goes to storage
        return null;
    }
}

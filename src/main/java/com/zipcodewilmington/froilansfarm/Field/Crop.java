package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop implements Produce {
    public boolean hasBeenHarvested(){
        return false;
    }
    public boolean hasBeenFertilized(){
        return false;
    }

}

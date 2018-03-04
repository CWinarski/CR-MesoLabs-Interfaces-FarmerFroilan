package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop implements Produce {
    abstract boolean hasBeenHarvested();
    abstract boolean hasBeenFertilized();

}

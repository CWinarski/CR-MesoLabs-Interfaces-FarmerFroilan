package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {
    public Edible yield() {
        return null;
    }

    boolean hasBeenHarvested() {
        return false;
    }

    boolean hasBeenFertilized() {
        return false;
    }
}

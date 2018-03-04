package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Edibles.Apple;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class AppleTree extends Crop {
    public Edible yield() {
        return new Apple();
    }

    boolean hasBeenHarvested() {
        return false;
    }

    boolean hasBeenFertilized() {
        return false;
    }
}

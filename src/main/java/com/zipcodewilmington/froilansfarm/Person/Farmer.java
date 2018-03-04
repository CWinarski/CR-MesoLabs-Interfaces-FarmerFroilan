package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.*;

public class Farmer extends Person implements Rider, Botanist {
    public Farmer(String name) {
        super(name);
    }

    public String getName(){
        return this.name;
    }

    public String fertilize(CropRow cropRow) {
        return this.name + " fertilized the " + cropRow.getClass().getSimpleName() + "!";
    }

    public String plant(Crop crop) {
        return this.name + " planted the " + crop.getClass().getSimpleName() + "!";
    }

    public String makeNoise() {
        return "Hello!";
    }

    public String mount(Rideable rideable) {
        return this.name + " mounted the " + rideable.getClass().getSimpleName() + "!";
    }

    public String dismount(Rideable rideable) {
        return this.name + " dismounted the " + rideable.getClass().getSimpleName() + "!";
    }

    public String eat(Edible edible) {
        return this.name + " ate the " + edible.getClass().getSimpleName() + "!";
    }
}

package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist {
    public Farmer(String name) {
        super(name);
    }

    public String fertilize(CropRow cropRow) {
        return null;
    }

    public String plant(Crop crop) {
        return null;
    }

    public String eat(Edible edible) {
        return null;
    }

    public String makeNoise() {
        return null;
    }

    public String mount(Rideable rideable) {
        return null;
    }

    public String dismount(Rideable rideable) {
        return null;
    }
}

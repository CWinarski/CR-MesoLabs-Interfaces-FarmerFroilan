package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    public boolean isRideable = true;

    public String eat(Edible edible) {
        return "The Horse ate the " + edible.getClass().getSimpleName() + "!";
    }

    public String makeNoise() {
        return "Neigh!";
    }
}

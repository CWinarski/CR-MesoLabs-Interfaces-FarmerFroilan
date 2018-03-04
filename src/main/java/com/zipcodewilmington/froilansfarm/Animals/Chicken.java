package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {


    public String makeNoise() {
        return "Cluck!";
    }

    public Edible yield() {
        return new Egg();
    }

    public String eat(Edible edible) {
        return "The Chicken ate the " + edible.getClass().getSimpleName()+ "!";
    }
}

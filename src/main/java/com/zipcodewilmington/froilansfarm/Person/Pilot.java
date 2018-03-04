package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Pilot extends Person{

    public Pilot(String name){
        super(name);
    }

    public String eat(Edible edible) {
        return this.name + " ate the " + edible.getClass().getSimpleName() + "!";
    }

    public String makeNoise() {
        return "Hiya!";
    }

}

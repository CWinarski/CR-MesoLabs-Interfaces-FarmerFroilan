package com.zipcodewilmington.froilansfarm.Factories;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

public class HorseFactory {
    public static Horse createHorse(){
        return new Horse();
    }
}

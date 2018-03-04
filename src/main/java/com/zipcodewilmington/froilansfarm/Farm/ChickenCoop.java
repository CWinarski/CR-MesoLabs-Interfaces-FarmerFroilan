package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop extends FarmStructures {

private final ArrayList<Chicken> chickensInCoop = new ArrayList<Chicken>();

    public void addChickenToCoop(Chicken chicken){
        chickensInCoop.add(chicken);
    }

}

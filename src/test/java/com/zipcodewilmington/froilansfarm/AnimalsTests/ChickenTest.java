package com.zipcodewilmington.froilansfarm.AnimalsTests;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Edibles.Earcorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    Chicken chickenTest = new Chicken();

    @Test
    public void yieldTest(){
        Assert.assertTrue(chickenTest.yield() instanceof Egg);
    }

    @Test
    public void eatTest(){
        //Given
        Earcorn earcorn = new Earcorn();
        String expected = "The Chicken ate the Earcorn!";
        //When
        String actual = chickenTest.eat(earcorn);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest(){
        String expected = "Cluck!";
        String actual = chickenTest.makeNoise();
        Assert.assertEquals(expected, actual);
    }




}

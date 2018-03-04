package com.zipcodewilmington.froilansfarm.AnimalsTests;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Edibles.Earcorn;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    Horse horseTest = new Horse();

    @Test
    public void makeNoiseTest(){
        String expected = "Neigh!";
        String actual = horseTest.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        Earcorn earcorn = new Earcorn();
        String expected = "The Horse ate the Earcorn!";
        String actual = horseTest.eat(earcorn);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rideableTest(){
        Assert.assertTrue(horseTest.isRideable);
    }
}

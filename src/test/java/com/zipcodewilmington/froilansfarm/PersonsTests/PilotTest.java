package com.zipcodewilmington.froilansfarm.PersonsTests;

import com.zipcodewilmington.froilansfarm.Edibles.Apple;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {
    Pilot pilot = new Pilot("Froilanda");
    Apple appleTest = new Apple();

    @Test
    public void makeNoiseTest(){
        String expected = "Hiya!";
        String actual = pilot.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        String expected = "Froilanda ate the Apple!";
        String actual = pilot.eat(appleTest);
        Assert.assertEquals(expected, actual);
    }
}

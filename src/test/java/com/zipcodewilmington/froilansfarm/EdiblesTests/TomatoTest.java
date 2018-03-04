package com.zipcodewilmington.froilansfarm.EdiblesTests;

import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {
    Tomato tomatoTest = new Tomato();
    @Test
    public void isEdibleTest(){
        Assert.assertTrue(tomatoTest.isEdible());
    }
}

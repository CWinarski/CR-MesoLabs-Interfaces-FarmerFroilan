package com.zipcodewilmington.froilansfarm.EdiblesTests;

import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import org.junit.Assert;
import org.junit.Test;

public class EggTest {
    Egg eggTest = new Egg();
    @Test
    public void isEdibleTest(){
        Assert.assertTrue(eggTest.isEdible());
    }
}

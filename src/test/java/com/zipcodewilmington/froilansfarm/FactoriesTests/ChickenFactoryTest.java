package com.zipcodewilmington.froilansfarm.FactoriesTests;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Factories.ChickenFactory;
import org.junit.Assert;
import org.junit.Test;

public class ChickenFactoryTest {
    @Test
    public void chickenFactoryTest(){
        Chicken chickenTest = ChickenFactory.createChicken();
        Assert.assertTrue(chickenTest instanceof Chicken);
    }
}

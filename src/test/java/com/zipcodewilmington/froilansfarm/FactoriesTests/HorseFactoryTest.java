package com.zipcodewilmington.froilansfarm.FactoriesTests;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Factories.HorseFactory;
import org.junit.Assert;
import org.junit.Test;

public class HorseFactoryTest {
    @Test
    public void HorseFactoryTest(){
        Horse horseTest = HorseFactory.createHorse();
        Assert.assertTrue(horseTest instanceof Horse);
    }
}

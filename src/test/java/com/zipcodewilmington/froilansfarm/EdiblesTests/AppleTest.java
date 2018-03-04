package com.zipcodewilmington.froilansfarm.EdiblesTests;

import com.zipcodewilmington.froilansfarm.Edibles.Apple;
import org.junit.Assert;
import org.junit.Test;

public class AppleTest {
    Apple appleTest = new Apple();
    @Test
    public void isEdibleTest(){
        Assert.assertTrue(appleTest.isEdible());
    }
}

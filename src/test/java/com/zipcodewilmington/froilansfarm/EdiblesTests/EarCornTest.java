package com.zipcodewilmington.froilansfarm.EdiblesTests;

import com.zipcodewilmington.froilansfarm.Edibles.Earcorn;
import org.junit.Assert;
import org.junit.Test;

public class EarCornTest {
    Earcorn earcorn = new Earcorn();
    @Test
    public void isEdibleTest(){
        Assert.assertTrue(earcorn.isEdible());
    }
}

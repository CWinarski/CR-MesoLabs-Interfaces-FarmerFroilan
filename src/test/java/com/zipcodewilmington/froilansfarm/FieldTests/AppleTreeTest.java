package com.zipcodewilmington.froilansfarm.FieldTests;

import com.zipcodewilmington.froilansfarm.Edibles.Apple;
import com.zipcodewilmington.froilansfarm.Field.AppleTree;
import org.junit.Assert;
import org.junit.Test;

public class AppleTreeTest {
    AppleTree appleTreeTest = new AppleTree();
    @Test
    public void yieldTest(){
        Assert.assertTrue(appleTreeTest.yield() instanceof Apple);
    }
}

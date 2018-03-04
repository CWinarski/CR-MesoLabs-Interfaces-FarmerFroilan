package com.zipcodewilmington.froilansfarm.VehiclesTests;

import com.zipcodewilmington.froilansfarm.Field.AppleTree;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicles.Cropduster;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
    Cropduster cropdusterTest = new Cropduster();
    CropRow<AppleTree> appleTreeCropRow = new CropRow<AppleTree>();

    @Test
    public void fertilizeTest(){
        String expected = "Cropduster fertilized the CropRow!";
        String actual = cropdusterTest.fertilize(appleTreeCropRow);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void operateTest(){
        String expected = "Ready to work on the Farm!";
        String actual = cropdusterTest.operate();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void makeNoiseTest(){
        String expected = "Engine roars";
        String actual = cropdusterTest.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fly(){
        String expected = "Soars above the Farm";
        String actual = cropdusterTest.fly();
        Assert.assertEquals(expected, actual);
    }
}

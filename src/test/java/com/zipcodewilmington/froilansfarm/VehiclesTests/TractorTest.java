package com.zipcodewilmington.froilansfarm.VehiclesTests;

import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {
   Tractor tractorTest = new Tractor();

   @Test
    public void operateTest(){
       String expected = "Ready to work on the Farm!";
       String actual = tractorTest.operate();
       Assert.assertEquals(expected, actual);
   }

   @Test
    public void makeNoiseTest(){
       String expected = "Engine splutters";
       String actual = tractorTest.makeNoise();
       Assert.assertEquals(expected, actual);
   }

   @Test
    public void harvestTest(){

   }
}

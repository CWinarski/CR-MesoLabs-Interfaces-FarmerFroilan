package com.zipcodewilmington.froilansfarm.PersonsTests;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Edibles.Earcorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Field.Cornstalk;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTests {
    Farmer farmer = new Farmer("Froilan");
    CropRow<Earcorn> earCornRow = new CropRow<Earcorn>();
    Cornstalk cornstalk = new Cornstalk();
    Horse horseTest = new Horse();
    Egg eggTest = new Egg();

    @Test
    public void fertilizeTest() {
        String expected = "Froilan fertilized the CropRow!";
        String actual = farmer.fertilize(earCornRow);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plantCropTest(){
        String expected = "Froilan planted the Cornstalk!";
        String actual = farmer.plant(cornstalk);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest(){
        String expected = "Hello!";
        String actual = farmer.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTest(){
        String expected = "Froilan mounted the Horse!";
        String actual = farmer.mount(horseTest);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest(){
        String expected = "Froilan dismounted the Horse!";
        String actual = farmer.dismount(horseTest);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        String expected = "Froilan ate the Egg!";
        String actual = farmer.eat(eggTest);
        Assert.assertEquals(expected, actual);
    }
}

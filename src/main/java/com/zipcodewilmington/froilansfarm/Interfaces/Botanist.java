package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;

public interface Botanist {
    String fertilize(CropRow cropRow);
    String plant(Crop crop);
}

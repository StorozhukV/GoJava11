package com.company.homework5_3.base;

import com.company.homework5_3.flowers.ChamamileFlower;
import com.company.homework5_3.flowers.RoseFlower;
import com.company.homework5_3.flowers.TulipFlower;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FlowersLoader {
    public static SuperFlower[] load(String path) {
        SuperFlower[] flowers = new SuperFlower[0];
        try {
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);
            int length = Integer.parseInt(bufferedReader.readLine());
            flowers = new SuperFlower[length];
            try {
                for (int i = 0; i < length; i++) {
                    String flower = bufferedReader.readLine();
                    if (RoseFlower.class.getSimpleName() == flower) {
                        flowers[i] = new RoseFlower();
                    } else if (ChamamileFlower.class.getSimpleName() == flower) {
                        flowers[i] = new ChamamileFlower();
                    } else if (TulipFlower.class.getSimpleName() == flower) {
                        flowers[i] = new TulipFlower();
                    }
                }
            }
            catch (IOException e){e.printStackTrace();}
        }catch (IOException e) {e.printStackTrace();}
        return flowers;
    }
}

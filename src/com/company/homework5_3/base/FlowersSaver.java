package com.company.homework5_3.base;

import java.io.FileWriter;
import java.io.IOException;

public abstract class FlowersSaver {
    public static void save(SuperFlower[] flowers, String path) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(flowers.length + "\n");
            for (SuperFlower flower : flowers) {
                writer.write(flower.getClass().getSimpleName() + ", ");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

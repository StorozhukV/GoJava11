package com.company.module4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Snowman extends Figure {

    @Override
    public void draw(GraphicsContext gc) {
        int width = (int) gc.getCanvas().getWidth();
        int height = (int) gc.getCanvas().getHeight();
        int currentyY = height;
        while (currentyY > 0) {
            int radius = getRandom(height / 8, height / 4);
            int x = width / 2 - radius;
            int y = currentyY - radius * 2;

            gc.setFill(Color.rgb(getRandom(0, 255), getRandom(0, 255), getRandom(0, 255)));
            if (y < 0) {
                break;
            }
            Circle circle = new Circle();
            circle.setX(x);
            circle.setY(y);
            circle.setRadius(radius);
            circle.draw(gc);

            currentyY -= 2 * radius;
        }


    }

    private int getRandom(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min);
    }
}

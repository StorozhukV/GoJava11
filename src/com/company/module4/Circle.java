package com.company.module4;

import javafx.scene.canvas.GraphicsContext;

public class Circle extends Figure {
    private int radius;

    public void setRadius (int r){
        radius = r;
    }
    public void draw(GraphicsContext gc) {
        gc.fillOval(x, y, radius*2, radius*2);
    }
}

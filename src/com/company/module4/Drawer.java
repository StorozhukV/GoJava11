package com.company.module4;

import javafx.scene.canvas.GraphicsContext;

public class Drawer {
    GraphicsContext gc;

    public Drawer(GraphicsContext gc) {
        this.gc = gc;
    }

    public void draw (Figure f){
        f.draw(gc);
    }
}

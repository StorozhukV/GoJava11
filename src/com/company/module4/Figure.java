package com.company.module4;

import javafx.scene.canvas.GraphicsContext;

public abstract class Figure {
    protected int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    abstract public void draw(GraphicsContext gc);
}

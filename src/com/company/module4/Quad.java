package com.company.module4;

import javafx.scene.canvas.GraphicsContext;

public class Quad extends Figure {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.fillRect(x, y, side, side);

    }
}

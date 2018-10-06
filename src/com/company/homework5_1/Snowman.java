package com.company.homework5_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class Snowman extends Application {
    public static final int width = 1000;
    public static final int height = 900;

    public static void main(String[] args) {
        launch(args);
    }

    public static class MyRandom {
        private static final Random r = new Random();

        public static float random(float min, float max) {
            return (float) (min + Math.random() * (max - min));
        }

        public static Color getRandom() {
            return Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble());
        }
    }

    void drawCircle(Pane root, int x, int y, float radius) {
        Circle circle = new Circle();
        circle.setCenterX(x);
        circle.setCenterY(y - radius);
        circle.setRadius(radius);
        circle.setFill(Color.WHITE);
        circle.setStroke(MyRandom.getRandom());
        circle.setStrokeWidth(1);
        root.getChildren().addAll(circle);
    }

    void drawEyes(Pane root, int x, int y, float radius) {
        Circle[] eyes = new Circle[2];
        for (int i = 0; i < eyes.length; i++) {
            eyes[i] = new Circle();
        }
        eyes[0].setCenterX(x + radius / 2);
        eyes[0].setCenterY(y - radius / 4);
        eyes[0].setRadius(MyRandom.random(1, 10));
        eyes[1].setCenterX(x - radius / 2);
        eyes[1].setCenterY(y - radius / 4);
        eyes[1].setRadius(MyRandom.random(1, 5));

        for (int i = 0; i < eyes.length; i++) {
            eyes[i].setFill(Color.WHITE);
            eyes[i].setStroke(MyRandom.getRandom());
            eyes[i].setStrokeWidth(2);
        }
        root.getChildren().addAll(eyes);
    }

    void drawMouth(Pane root, int x, int y, float radius) {
        Circle mouth = new Circle();
        mouth.setCenterX(x);
        mouth.setCenterY(y + radius / 10);
        mouth.setRadius(MyRandom.random(1, 5));
        mouth.setFill(Color.WHITE);
        mouth.setStroke(MyRandom.getRandom());
        mouth.setStrokeWidth(2);
        root.getChildren().addAll(mouth);

    }

    public Snowman(Pane root, int size, float minRadius, float maxRadius, int width, int height) {
        int x = width / 2;
        int y = height-36;
        float radius;
        for (int i = size - 1; i >= 0; i--) {
            radius = MyRandom.random(minRadius, maxRadius);
            drawCircle(root, x, y, radius);
            if (i == 0) {
                drawEyes(root, x, y - (int) radius, radius);
                drawMouth(root, x, y - (int) radius, radius);
            }
            y -= radius * 2;

        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final Canvas canvas = new Canvas(width, height);
        Pane root = new Pane();
        root.getChildren().add(canvas);
        //drawCircle(root,100,500,50);
        primaryStage.setTitle("Snowman :)");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

}

package com.company.module4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root,WIDTH, HEIGHT);

        final GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        primaryStage.setScene(scene);
        primaryStage.show();

        Snowman body = new Snowman();
        Drawer drawer = new Drawer(graphicsContext);
        drawer.draw(body);
    }
}

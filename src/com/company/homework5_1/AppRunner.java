package com.company.homework5_1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AppRunner extends Application {
    public static final int width = 880;
    public static final int height = 600;
    private Scene scene1;
    private Scene scene2;
    private Scene menu;

    public static void main(String[] args) {
        launch(args);
    }

    private void initStarViews(Stage primaryStage, Pane root) {

        Label[] labels = new Label[]{new Label("Центр х"),
                new Label("Центр у"),
                new Label("Радиус звезды")};
        int labelX = 10;
        int textX = 200;
        int distanceY = 30;
        int labelY = 15;
        labels[0].setTranslateX(labelX);
        labels[0].setTranslateY(labelY);
        labels[1].setTranslateX(labelX);
        labels[1].setTranslateY(labelY + distanceY);
        labels[2].setTranslateX(labelX);
        labels[2].setTranslateY(labelY + distanceY * 2);
        TextField textFieldCenerX = new TextField();
        TextField textFieldCenetrY = new TextField();
        TextField textFieldRadius = new TextField();

        textFieldCenerX.setTranslateX(textX);
        textFieldCenerX.setTranslateY(labelY);
        textFieldCenetrY.setTranslateX(textX);
        textFieldCenetrY.setTranslateY(labelY + distanceY);
        textFieldRadius.setTranslateX(textX);
        textFieldRadius.setTranslateY(labelY + distanceY * 2);

        Button buttonShow = new Button("Показать Звезду");
        buttonShow.setTranslateX(textX);
        buttonShow.setTranslateY(labelY + distanceY * 4);

        Button buttonBack = new Button("Back");
        buttonBack.setTranslateX(800);
        buttonBack.setTranslateY(10);

        Button buttonBack2 = new Button("Вернуться на главную");
        buttonBack2.setTranslateX(700);
        buttonBack2.setTranslateY(400);

        buttonShow.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root.getChildren().clear();
                int centerX = Integer.parseInt(textFieldCenerX.getText());
                int centerY = Integer.parseInt(textFieldCenetrY.getText());
                float Radius = Float.parseFloat(textFieldRadius.getText());
                Star star = new Star(root, centerX, centerY, Radius);
                root.getChildren().addAll(buttonBack);
            }
        });

        buttonBack.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root.getChildren().clear();
                root.getChildren().addAll(textFieldCenerX, textFieldCenetrY, textFieldRadius, buttonShow);
                root.getChildren().addAll(labels);
                root.getChildren().addAll(buttonBack2);
                primaryStage.setScene(scene2);
            }
        });
        buttonBack2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setScene(menu);
            }
        });
        root.getChildren().addAll(buttonShow, textFieldCenerX, textFieldCenetrY, textFieldRadius, buttonBack2);
        root.getChildren().addAll(labels);
    }

    private void initSnowmanViews(Stage primaryStage, Pane root) {

        Label[] labels = new Label[]{new Label("Количество кругов"),
                new Label("Минимальный радиус"),
                new Label("Максимальный радиус")};
        int labelX = 10;
        int textX = 200;
        int distanceY = 30;
        int labelY = 15;
        labels[0].setTranslateX(labelX);
        labels[0].setTranslateY(labelY);
        labels[1].setTranslateX(labelX);
        labels[1].setTranslateY(labelY + distanceY);
        labels[2].setTranslateX(labelX);
        labels[2].setTranslateY(labelY + distanceY * 2);
        TextField textFieldCircles = new TextField();
        TextField textFieldMinRadius = new TextField();
        TextField textFieldMaxRadius = new TextField();

        textFieldCircles.setTranslateX(textX);
        textFieldCircles.setTranslateY(labelY);
        textFieldMinRadius.setTranslateX(textX);
        textFieldMinRadius.setTranslateY(labelY + distanceY);
        textFieldMaxRadius.setTranslateX(textX);
        textFieldMaxRadius.setTranslateY(labelY + distanceY * 2);

        Button buttonShow = new Button("Показать Снеговика");
        buttonShow.setTranslateX(textX);
        buttonShow.setTranslateY(labelY + distanceY * 4);

        Button buttonBack = new Button("Back");
        buttonBack.setTranslateX(800);
        buttonBack.setTranslateY(10);

        Button buttonBack2 = new Button("Вернуться на главную");
        buttonBack2.setTranslateX(700);
        buttonBack2.setTranslateY(400);

        buttonShow.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root.getChildren().clear();
                int circles = Integer.parseInt(textFieldCircles.getText());
                float minRadius = Float.parseFloat(textFieldMinRadius.getText());
                float maxRadius = Float.parseFloat(textFieldMaxRadius.getText());
                Snowman man = new Snowman(root, circles, minRadius, maxRadius, width, height);
                root.getChildren().addAll(buttonBack);
            }
        });

        buttonBack.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root.getChildren().clear();
                root.getChildren().addAll(textFieldCircles, textFieldMinRadius, textFieldMaxRadius, buttonShow);
                root.getChildren().addAll(labels);
                root.getChildren().addAll(buttonBack2);
                primaryStage.setScene(scene1);
            }
        });

        buttonBack2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setScene(menu);
            }
        });
        root.getChildren().addAll(buttonShow, textFieldCircles, textFieldMinRadius, textFieldMaxRadius, buttonBack2);
        root.getChildren().addAll(labels);
    }

    private Scene initSnowmanScene(Stage primaryStage) {
        Pane root = new Pane();
        root.setMinHeight(height);
        root.setMinWidth(width);
        initSnowmanViews(primaryStage, root);
        return new Scene(root);
    }

    private Scene initStarScene(Stage primaryStage) {
        Pane root = new Pane();
        root.setMinWidth(width);
        root.setMinHeight(height);
        initStarViews(primaryStage, root);
        return new Scene(root);
    }

    private Scene Menu(Stage primaryStage, Scene scene1, Scene scene2) {
        Pane root = new Pane();
        int distanceX = 400;
        Button buttonSnowman = new Button("Снеговик");
        Button buttonStar = new Button("Звезда");
        Button buttonExit = new Button("Выход");
        buttonSnowman.setTranslateX(width/2.5);
        buttonSnowman.setTranslateY(height/4);
        buttonSnowman.setMinWidth(200);
        buttonSnowman.setStyle("-fx-font: 14pt cambria; -fx-base: #FFFFFF;");
        buttonStar.setTranslateX(width/2.5);
        buttonStar.setTranslateY(height/3);
        buttonStar.setMinWidth(200);
        buttonStar.setStyle("-fx-font: 14pt cambria ; -fx-base: #e79423;");
        buttonExit.setTranslateX(width/2.5);
        buttonExit.setTranslateY(height/2);
        buttonExit.setMinWidth(200);
        buttonExit.setMinHeight(100);
        buttonExit.setStyle("-fx-font: 44 arial ; -fx-base: #b6e7c9;");
        DropShadow shadow = new DropShadow();

        buttonExit.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        buttonExit.setEffect(shadow);
                    }
                });

        buttonExit.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        buttonExit.setEffect(null);
                    }
                });
        buttonSnowman.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setScene(scene1);
            }
        });

        buttonStar.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setScene(scene2);
            }
        });
        buttonExit.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.close();
            }
        });
        root.getChildren().addAll(buttonSnowman, buttonStar, buttonExit);
        return new Scene(root);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setWidth(width);
        primaryStage.setHeight(height);
        primaryStage.setTitle("Storozhuk");
        scene1 = initSnowmanScene(primaryStage);
        scene2 = initStarScene(primaryStage);
        menu = Menu(primaryStage, scene1, scene2);
        menu.getRoot();
        primaryStage.setScene(menu);
        primaryStage.show();
    }
}

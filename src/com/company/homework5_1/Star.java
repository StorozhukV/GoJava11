package com.company.homework5_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Star  extends Application {
    private final int width = 1000;
    private final int height = 900;

    final Canvas canvas = new Canvas(width, height);

    public static void main(String[] args) {
        launch(args);
    }

    void DrawStar(GraphicsContext gc, int x, int y, float radius) {
        double[] xPoint = {x, x + radius / 4, x + radius, x + radius / 2.5, x + radius - 60, x, x - radius + 60, x - radius / 2.5, x - radius, x - radius / 4};
        double[] yPoint ={y-radius, y-radius/4, y-radius/5, y+radius/4, y+radius, y+radius/2, y+radius, y+radius/4, y-radius/5, y-radius/4};
        gc.setStroke(Snowman.MyRandom.getRandom());
        gc.strokePolygon(xPoint,yPoint, xPoint.length);

        //        Line[] line = new Line[10];
//        for (int i = 0; i<= line.length; i++){
//            line [i].setStartX(x);
//            line [i].setStartY(y-radius);
//            line [i].setEndX(x+radius/5);
//            line[i].setEndY(y-radius/10);
//            line [i+1].setStartX();
//        }

    }
    public Star (Pane root, int x, int y, float radius){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter x = ");
//        x = sc.nextInt();
//        System.out.print("Enter y = ");
//        y = sc.nextInt();
//        System.out.print("Enter radius = ");
//        radius = sc.nextFloat();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        DrawStar(gc,x, y, radius);
        root.getChildren().add(canvas);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        primaryStage.setTitle("Star :)");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

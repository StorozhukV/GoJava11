package com.company.homework5_2;

import com.company.homework5_2.Players.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppRunner extends Application {
    public static final int width = 880;
    public static final int height = 600;
    private Scene menu;
    public static void main(String[] args) {
        showAllPlayers();
        launch(args);
    }

    public static void showAllPlayers(){
        System.out.println("\tPlayer1:");
        Player1 player1 = new Player1(1000);
        player1.playSong();

        System.out.println("\tPlayer3:");
        Player3 player3 = new Player3(1570);
        player3.playSong();
        player3.playAllSongs();

        System.out.println("\tPlayer4:");
        Player4 player4 = new Player4(1800);
        player4.playSong();
        player4.playAllSongs();

        System.out.println("\tPlayer5:");
        Player5 player5 = new Player5(2000);
        player5.playSong();
        player5.playAllSongs();

        System.out.println("\tPlayer6:");
        Player6 player6 = new Player6(3000);
        player6.playSong();
        player6.playAllSongs();
        player6.shuffle();

        System.out.println("\tPlayer2:");
        Player2 player2 = new Player2(1500);
        player2.playSong();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}

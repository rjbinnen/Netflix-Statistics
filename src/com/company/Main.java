package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
	// write your code here

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Scene homeScene = new Scene(borderPane);
        primaryStage.setTitle("Netflix Statistics - Home");
        primaryStage.setScene(homeScene);
        primaryStage.show();
    }
}

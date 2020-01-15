package com.company.GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GuiView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Scene homeScene = new Scene(borderPane);
        primaryStage.setTitle("Netflix Statistics - Home");
        primaryStage.setScene(homeScene);
        primaryStage.show();
    }
}


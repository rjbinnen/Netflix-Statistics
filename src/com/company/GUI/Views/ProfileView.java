package com.company.GUI.Views;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ProfileView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPaneProfile = new GridPane();
        Scene ProfileScene = new Scene(gridPaneProfile);
        primaryStage.setTitle("Netflix Statistics - Choose Profile");
        primaryStage.setScene(ProfileScene);


    }
}

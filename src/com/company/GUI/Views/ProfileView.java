package com.company.GUI.Views;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ProfileView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPaneProfile = new GridPane();
        Scene ProfileScene = new Scene(gridPaneProfile);
        primaryStage.setTitle("Netflix Statistics - Choose Profile");
        primaryStage.setScene(ProfileScene);

        //Insert naam profielen + klik naar ander scherm idfk
        Button profile1 = new Button();
        Button profile2 = new Button();
        Button profile3 = new Button();
        Button profile4 = new Button();

        Button createProfile = new Button("Create Profile");
        gridPaneProfile.setAlignment(Pos.CENTER);
        gridPaneProfile.add(profile1, 0, 0);
        gridPaneProfile.add(profile2, 1, 0);
        gridPaneProfile.add(profile3, 0, 1);
        gridPaneProfile.add(profile4, 1, 1);
        gridPaneProfile.add(createProfile, 0, 2);

        primaryStage.show();

    }
}
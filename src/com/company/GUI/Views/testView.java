package com.company.GUI.Views;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class testView extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Profile view
        GridPane gridPaneProfile = new GridPane();
        Scene profileScene = new Scene(gridPaneProfile);
        gridPaneProfile.setMinSize(400, 200);


        //Insert naam profielen + klik naar ander scherm
        Button profile1 = new Button();
        Button profile2 = new Button();
        Button profile3 = new Button();
        Button profile4 = new Button();
        Label emptyLabel = new Label();
        Label emptyLabel2 = new Label();

        Button createProfile = new Button("Create Profile");
        Button logOutAccount = new Button("Log out");

        gridPaneProfile.setAlignment(Pos.CENTER);
        gridPaneProfile.add(profile1, 0, 0);
        gridPaneProfile.add(profile2, 2, 0);
        gridPaneProfile.add(emptyLabel, 0, 1);
        gridPaneProfile.add(profile3, 0, 2);
        gridPaneProfile.add(profile4, 2, 2);
        gridPaneProfile.add(emptyLabel2, 0, 3);
        gridPaneProfile.add(logOutAccount, 0, 4);
        gridPaneProfile.add(createProfile, 3, 4);


        primaryStage.setTitle("Netflix Statistics - Choose Profile");

        primaryStage.setScene(profileScene);
        primaryStage.show();
    }
}

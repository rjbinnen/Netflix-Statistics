package com.company.GUI.Views;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class testView extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Profile view
        GridPane gridPaneHomePage = new GridPane();
        Scene homeScene = new Scene(gridPaneHomePage);

        Button buttonHomeDeleteProfile = new Button("Delete Profile");
        Button buttonChooseProfile = new Button("Choose different Profile");

        Text textHomeSeenPrograms = new Text("Programs you have watched: ");
        Text textHomeRecommendedProgram = new Text("Recommended program: ");

        Label labelHomeProfileName = new Label("-INSERT PROFILE NAME-");
        Label labelHomeSeenPrograms = new Label("-INSERT WATCHED PROGRAMS");
        Label labelHomeRecommendedProgram = new Label("-INSERT RECOMMENDED PROGRAM-");

        gridPaneHomePage.setAlignment(Pos.CENTER);
        gridPaneHomePage.add(labelHomeProfileName, 0, 0);
        gridPaneHomePage.add(textHomeSeenPrograms, 0, 1);
        gridPaneHomePage.add(labelHomeSeenPrograms, 2, 1);
        gridPaneHomePage.add(textHomeRecommendedProgram, 0, 2);
        gridPaneHomePage.add(labelHomeRecommendedProgram, 2, 2);
        gridPaneHomePage.add(buttonHomeDeleteProfile, 0, 3);
        gridPaneHomePage.add(buttonChooseProfile, 2, 3);


        primaryStage.setTitle("Netflix Statistics - Home");

        primaryStage.setScene(homeScene);
        primaryStage.show();
    }
}

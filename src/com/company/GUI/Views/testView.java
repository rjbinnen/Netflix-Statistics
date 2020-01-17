package com.company.GUI.Views;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class testView extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPaneCreateProfile = new GridPane();
        Scene createProfileScene = new Scene(gridPaneCreateProfile);

        Text textCreateProfileName = new Text("Profile name: ");
        Text textCreateProfileBirthDate = new Text("BirthDate");

        TextField textFieldCreateProfileName = new TextField();
        DatePicker datePickerCreateProfileBirthDate = new DatePicker();

        Button createProfileConfirm = new Button("Confirm");
        Button createProfileCancel = new Button("Cancel");

        gridPaneCreateProfile.setAlignment(Pos.CENTER);
        gridPaneCreateProfile.add(textCreateProfileName, 0, 0);
        gridPaneCreateProfile.add(textFieldCreateProfileName, 1, 0);
        gridPaneCreateProfile.add(textCreateProfileBirthDate, 0, 1);
        gridPaneCreateProfile.add(datePickerCreateProfileBirthDate, 1, 1);
        gridPaneCreateProfile.add(createProfileConfirm, 0, 2);
        gridPaneCreateProfile.add(createProfileCancel, 1, 2);

        primaryStage.setTitle("Netflix Statistics - Create Profile");

        primaryStage.setScene(createProfileScene);
        primaryStage.show();
    }
}

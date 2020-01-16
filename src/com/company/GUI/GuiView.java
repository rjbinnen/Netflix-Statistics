package com.company.GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPaneHome = new GridPane();
        Scene homeScene = new Scene(gridPaneHome);
        primaryStage.setTitle("Netflix Statistics - Home");

        Button registerButton = new Button("Register");
        gridPaneHome.getChildren().addAll(registerButton);
        gridPaneHome.setConstraints(registerButton, 10, 2);

        primaryStage.setScene(homeScene);
        primaryStage.show();

        BorderPane borderPaneRegister = new BorderPane();
        Scene register = new Scene(borderPaneRegister);


    }
}


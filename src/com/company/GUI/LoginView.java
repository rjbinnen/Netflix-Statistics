package com.company.GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPaneHome = new GridPane();
        Scene homeScene = new Scene(gridPaneHome);
        primaryStage.setTitle("Netflix Statistics - Home");

        Text textEmail = new Text("E-mail");
        Text textPassword = new Text("Password");

        TextField textFieldEmail = new TextField();
        PasswordField textFieldPassword = new PasswordField();

        Button logInButton = new Button("Log in");
        Button registerButton = new Button("Register");

        gridPaneHome.setMinSize(400, 200);
        gridPaneHome.setPadding(new Insets(10, 10, 10, 10));
        gridPaneHome.setVgap(5);
        gridPaneHome.setHgap(5);
        gridPaneHome.setAlignment(Pos.CENTER);

        gridPaneHome.add(textEmail, 0, 0);
        gridPaneHome.add(textFieldEmail, 1, 0);
        gridPaneHome.add(textPassword, 0, 1);
        gridPaneHome.add(textFieldPassword, 1, 1);
        gridPaneHome.add(logInButton, 0, 2);
        gridPaneHome.add(registerButton, 1, 2);

        primaryStage.setScene(homeScene);
        primaryStage.show();

    }
}

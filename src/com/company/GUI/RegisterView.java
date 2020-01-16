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

public class RegisterView extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPaneRegister = new GridPane();
        Scene RegisterScene = new Scene(gridPaneRegister);
        primaryStage.setTitle("Netflix Statistics - Register");

        Text textName = new Text("First Name + Last Name");
        Text textEmail = new Text("E-mail");
        Text textPassword = new Text("Password");
        Text textPasswordRepeat = new Text("Repeat Password");
        Text textStreetname = new Text("Streetname");
        Text textAddition = new Text("Addition");
        Text textResidence = new Text("Residence");

        TextField textFieldName = new TextField();
        TextField textFieldEmail = new TextField();
        PasswordField textFieldPassword = new PasswordField();
        PasswordField textFieldPasswordRepeat = new PasswordField();
        TextField textFieldStreetname = new TextField();
        TextField textFieldAddition = new TextField();
        TextField textFieldResidence = new TextField();

        Button confirmRegisterButton = new Button("Confirm Registration");

        gridPaneRegister.setMinSize(400, 200);
        gridPaneRegister.setPadding(new Insets(10, 10, 10, 10));
        gridPaneRegister.setVgap(5);
        gridPaneRegister.setHgap(5);
        gridPaneRegister.setAlignment(Pos.CENTER);

        gridPaneRegister.add(textName, 0, 0);
        gridPaneRegister.add(textFieldName, 1, 0);
        gridPaneRegister.add(textEmail, 0, 1);
        gridPaneRegister.add(textFieldEmail, 1, 1);
        gridPaneRegister.add(textPassword, 0, 2);
        gridPaneRegister.add(textFieldPassword, 1, 2);
        gridPaneRegister.add(textPasswordRepeat, 0, 3);
        gridPaneRegister.add(textFieldPasswordRepeat, 1, 3);
        gridPaneRegister.add(textStreetname, 0, 4);
        gridPaneRegister.add(textFieldStreetname, 1, 4);
        gridPaneRegister.add(textAddition, 0, 5);
        gridPaneRegister.add(textFieldAddition, 1, 5);
        gridPaneRegister.add(textResidence, 0, 6);
        gridPaneRegister.add(textFieldResidence, 1, 6);
        gridPaneRegister.add(confirmRegisterButton, 0, 7);

        primaryStage.setScene(RegisterScene);
        primaryStage.show();
    }
}

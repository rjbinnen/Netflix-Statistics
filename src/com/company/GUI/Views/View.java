package com.company.GUI.Views;

import com.company.GUI.Controllers.LoginController;
import com.company.GUI.Controllers.RegisterController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class View extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Opens this when app is started -- Login view

        GridPane gridPaneHome = new GridPane();
        Scene homeScene = new Scene(gridPaneHome);
        primaryStage.setTitle("Netflix Statistics - Log In");

        Text textEmail = new Text("E-mail");
        Text textPassword = new Text("Password");

        TextField textFieldEmail = new TextField();
        PasswordField textFieldPassword = new PasswordField();

        Label errorLabel = new Label("");

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
        gridPaneHome.add(registerButton, 1,2);
        gridPaneHome.add(errorLabel, 0, 3);

        //Register view
        GridPane gridPaneRegister = new GridPane();
        Scene registerScene = new Scene(gridPaneRegister);


        Text textName = new Text("First Name + Last Name");
        Text textRegisterEmail = new Text("E-mail");
        Text textRegisterPassword = new Text("Password");
        Text textPasswordRepeat = new Text("Repeat Password");
        Text textStreetName = new Text("Streetname");
        Text textAddition = new Text("Addition");
        Text textResidence = new Text("Residence");

        TextField textFieldName = new TextField();
        TextField textFieldRegisterEmail = new TextField();
        PasswordField textFieldRegisterPassword = new PasswordField();
        PasswordField textFieldPasswordRepeat = new PasswordField();
        TextField textFieldStreetName = new TextField();
        TextField textFieldAddition = new TextField();
        TextField textFieldResidence = new TextField();

        Button confirmRegisterButton = new Button("Confirm Registration");
        Button cancelButton = new Button("Cancel");

        gridPaneRegister.setMinSize(400, 200);
        gridPaneRegister.setPadding(new Insets(10, 10, 10, 10));
        gridPaneRegister.setVgap(5);
        gridPaneRegister.setHgap(5);
        gridPaneRegister.setAlignment(Pos.CENTER);

        gridPaneRegister.add(textName, 0, 0);
        gridPaneRegister.add(textFieldName, 1, 0);
        gridPaneRegister.add(textRegisterEmail, 0, 1);
        gridPaneRegister.add(textFieldRegisterEmail, 1, 1);
        gridPaneRegister.add(textRegisterPassword, 0, 2);
        gridPaneRegister.add(textFieldRegisterPassword, 1, 2);
        gridPaneRegister.add(textPasswordRepeat, 0, 3);
        gridPaneRegister.add(textFieldPasswordRepeat, 1, 3);
        gridPaneRegister.add(textStreetName, 0, 4);
        gridPaneRegister.add(textFieldStreetName, 1, 4);
        gridPaneRegister.add(textAddition, 0, 5);
        gridPaneRegister.add(textFieldAddition, 1, 5);
        gridPaneRegister.add(textResidence, 0, 6);
        gridPaneRegister.add(textFieldResidence, 1, 6);
        gridPaneRegister.add(confirmRegisterButton, 0, 7);
        gridPaneRegister.add(cancelButton, 1, 7);


        // Idk of deze meteen geactiveerd moet worden. primaryStage.setTitle("Netflix Statistics - Register");

        //Profile view
        GridPane gridPaneProfile = new GridPane();
        Scene ProfileScene = new Scene(gridPaneProfile);


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

        // Idk of deze meteen geactiveerd moet worden. primaryStage.setTitle("Netflix Statistics - Choose Profile");

        primaryStage.setScene(homeScene);
        primaryStage.show();

        //Hier worden alle button onClickActions aangeroepen en naar de controller verwezen.

        // Hier worden de knoppen voor de loginscene geregeld
        LoginController loginctrl = new LoginController(textFieldEmail, textFieldPassword, errorLabel, logInButton, registerButton);
        logInButton.setOnAction(loginctrl);
        registerButton.setOnAction(event -> {primaryStage.setScene(registerScene);});

        // Hier worden de knoppen voor de Registerscene geregeld

        RegisterController regctrl = new RegisterController(textFieldName, textFieldEmail, textFieldPassword, textFieldPasswordRepeat, textFieldStreetName, textFieldAddition, textFieldResidence);
        confirmRegisterButton.setOnAction(regctrl);
        cancelButton.setOnAction(event -> { primaryStage.setScene(homeScene);});
    }




}

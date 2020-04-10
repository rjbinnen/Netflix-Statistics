package com.company.GUI.Views;

import com.company.DAL.Database;
import com.company.Domain.Account;
import com.company.Domain.Episode;
import com.company.Domain.Profile;
import com.company.GUI.Controllers.RegisterController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;

public class View extends Application {

    private Account account;

    @Override
    @SuppressWarnings("Duplicates")
    public void start(Stage primaryStage) throws Exception {

        //testcode db connectie
        Database database = new Database();


        //testcode percWatchTime van episode
        Episode episode = new Episode(5, 60, 30);
        System.out.println(episode.percWatchTime());

        //Opens this when app is started -- Login view

        GridPane gridPaneHome = new GridPane();
        Scene logInScene = new Scene(gridPaneHome);
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
        gridPaneHome.add(errorLabel, 1, 4);

        //Register view
        GridPane gridPaneRegister = new GridPane();
        Scene registerScene = new Scene(gridPaneRegister);


        Text textName = new Text("First Name + Last Name");
        Text textRegisterEmail = new Text("E-mail");
        Text textRegisterPassword = new Text("Password");
        Text textPasswordRepeat = new Text("Repeat Password");
        Text textStreetName = new Text("Streetname");
        Text textHouseNumber = new Text("House number");
        Text textAddition = new Text("Addition");
        Text textCity = new Text("City");

        TextField textFieldName = new TextField();
        TextField textFieldRegisterEmail = new TextField();
        PasswordField textFieldRegisterPassword = new PasswordField();
        PasswordField textFieldPasswordRepeat = new PasswordField();
        TextField textFieldStreetName = new TextField();
        TextField textFieldHouseNumber = new TextField();
        TextField textFieldAddition = new TextField();
        TextField textFieldCity = new TextField();

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
        gridPaneRegister.add(textHouseNumber, 0, 5);
        gridPaneRegister.add(textFieldHouseNumber, 1, 5);
        gridPaneRegister.add(textAddition, 0, 6);
        gridPaneRegister.add(textFieldAddition, 1, 6);
        gridPaneRegister.add(textCity, 0, 7);
        gridPaneRegister.add(textFieldCity, 1, 7);
        gridPaneRegister.add(confirmRegisterButton, 0, 8);
        gridPaneRegister.add(cancelButton, 1, 8);


       primaryStage.setTitle("Netflix Statistics - Register");

        GridPane gridPaneProfile = new GridPane();
        Scene profileScene = new Scene(gridPaneProfile);
        gridPaneProfile.setMinSize(400, 200);


        //Insert naam profielen + klik naar ander scherm
        Button profile1 = new Button();
        Button profile2 = new Button();
        Button profile3 = new Button();
        Button profile4 = new Button();
        Button profile5 = new Button();
        Label emptyLabel = new Label();
        Label emptyLabel2 = new Label();
        Label emptyLabel3 = new Label();

        Button createProfile = new Button("Create Profile");
        Button logOutAccount = new Button("Log out");

        gridPaneProfile.setAlignment(Pos.CENTER);
        gridPaneProfile.add(profile1, 0, 0);
        gridPaneProfile.add(profile2, 2, 0);
        gridPaneProfile.add(emptyLabel, 0, 1);
        gridPaneProfile.add(profile3, 0, 2);
        gridPaneProfile.add(profile4, 2, 2);
        gridPaneProfile.add(emptyLabel3, 0, 3);
        gridPaneProfile.add(profile5, 0, 4);
        gridPaneProfile.add(emptyLabel2, 0, 5);
        gridPaneProfile.add(logOutAccount, 0, 6);
        gridPaneProfile.add(createProfile, 3, 6);


        primaryStage.setTitle("Netflix Statistics - Choose Profile");

        primaryStage.setScene(profileScene);
        primaryStage.show();

        //Create profile view
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

        //Home view
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

        primaryStage.setScene(logInScene);
        primaryStage.show();

        //Hier worden alle button onClickActions aangeroepen en naar de controller verwezen.

        // Hier worden de knoppen voor de loginscene geregeld

        logInButton.setOnAction(event -> {
            String email = "Blah@gmail.com";
            String pw = "Beepboop";
            if (textFieldEmail.getText().equals(email) && textFieldPassword.getText().equals(pw)){
                primaryStage.setScene(profileScene);
                textFieldEmail.clear();
                textFieldPassword.clear();
            } else {
                textFieldEmail.setText("");
                textFieldPassword.setText("");
                errorLabel.setText("Wrong username and password");
            }});
        registerButton.setOnAction(event -> {
            errorLabel.setText("");
            primaryStage.setScene(registerScene);});

        // Hier worden de knoppen voor de Registerscene geregeld


        confirmRegisterButton.setOnAction(event -> {
            //controleert input
            RegisterController regctrl = new RegisterController(textFieldName, textFieldRegisterEmail, textFieldRegisterPassword, textFieldPasswordRepeat, textFieldStreetName, textFieldHouseNumber, textFieldAddition, textFieldCity);
            Account account = regctrl.registerValidation();
            if (!account.getName().equals("Failed to register Account")) {
                System.out.println("Registration successful");
                Account verifiedAccount = account;
                //Add verifiedAccount to database
                primaryStage.setScene(logInScene);
            } else {
                System.out.println("failure");
            }


        }
        );

        cancelButton.setOnAction(event -> { primaryStage.setScene(logInScene);});

        // Hier worden de knoppen voor de profielen geregeld

        profile1.setOnAction(event -> {
            if (profile1.getText().equals("")){

            } else {
                primaryStage.setScene(homeScene);
                labelHomeProfileName.setText(profile1.getText());
            }
        });

        profile2.setOnAction(event -> {
            if (profile2.getText().equals("")){

            } else {
                primaryStage.setScene(homeScene);
                labelHomeProfileName.setText(profile2.getText());
            }
        });

        profile3.setOnAction(event -> {
            if (profile3.getText().equals("")){

            } else {
                primaryStage.setScene(homeScene);
                labelHomeProfileName.setText(profile3.getText());
            }
        });

        profile4.setOnAction(event -> {
            if (profile4.getText().equals("")){

                } else {
                primaryStage.setScene(homeScene);
                labelHomeProfileName.setText(profile4.getText());
            }
        });

        profile5.setOnAction(event -> {
            if (profile5.getText().equals("")){

            } else {
                primaryStage.setScene(homeScene);
                labelHomeProfileName.setText(profile5.getText());
            }
        });

        createProfile.setOnAction(event -> {
            if (profile5.getText().equals("")){
                primaryStage.setScene(createProfileScene);
            } else {

            }
        });

        logOutAccount.setOnAction(event -> {
            primaryStage.setScene(logInScene);
        });

        //Hier worden de knoppen voor het creëren van een profiel geregeld


        createProfileConfirm.setOnAction(event -> {
            if (profile1.getText().equals("")){
                Profile profile = new Profile(textFieldCreateProfileName.getText(), datePickerCreateProfileBirthDate.getValue(), null);
                profile1.setText(profile.getName());
                //account.addProfile(profile);
            } else if (profile2.getText().equals("")){
                Profile profile = new Profile(textFieldCreateProfileName.getText(), datePickerCreateProfileBirthDate.getValue(), null);
                profile2.setText(profile.getName());
                account.addProfile(profile);
            } else if (profile3.getText().equals("")) {
                Profile profile = new Profile(textFieldCreateProfileName.getText(), datePickerCreateProfileBirthDate.getValue(), null);
                profile3.setText(profile.getName());
                account.addProfile(profile);
            } else if (profile4.getText().equals("")) {
                Profile profile = new Profile(textFieldCreateProfileName.getText(), datePickerCreateProfileBirthDate.getValue(), null);
                profile4.setText(profile.getName());
                    account.addProfile(profile);
            }

            textFieldCreateProfileName.clear();
            datePickerCreateProfileBirthDate.setValue(null);
            primaryStage.setScene(profileScene);
        });

        createProfileCancel.setOnAction(event -> {
            primaryStage.setScene(profileScene);
        });

        //Hier worden de knoppen van de profielen geregeld

        buttonHomeDeleteProfile.setOnAction(event -> {

        });

        buttonChooseProfile.setOnAction(event -> {
            primaryStage.setScene(profileScene);
        });


    }




}

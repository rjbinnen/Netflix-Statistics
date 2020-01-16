package com.company.GUI.Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements EventHandler<ActionEvent> {
    private TextField field;
    private PasswordField pwfield;
    private Label label;
    private Button loginbtn;
    private Button regbtn;

    public LoginController(TextField field, PasswordField pwfield, Label label, Button loginbtn, Button regbtn ) {
    this.field = field;
    this.pwfield = pwfield;
    this.label = label;
    this.loginbtn = loginbtn;
    this.regbtn = regbtn;
    }


    @Override
    public void handle(ActionEvent event) {
        String email = "Blah@gmail.com";
        String pw = "Beepboop";
        if (field.getText().equals(email) && pwfield.getText().equals(pw)){
            label.setText("Beep Boop");
        } else {
            field.clear();
            pwfield.clear();
            label.setText("ERROR 404: Intelligence Not Found!");
        }

    }

   }

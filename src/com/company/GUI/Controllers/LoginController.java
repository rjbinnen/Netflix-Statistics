package com.company.GUI.Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements EventHandler<ActionEvent> {
    private TextField field;
    private PasswordField pwfield;
    private Label label;

    public LoginController(TextField field, PasswordField pwfield, Label label) {
    this.field = field;
    this.pwfield = pwfield;
    this.label = label;
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

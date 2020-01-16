package com.company.GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements EventHandler<ActionEvent> {
    private TextField field;
    private PasswordField pwfield;

    public LoginController(TextField field, PasswordField pwfield) {
    this.field = field;
    this.pwfield = pwfield;
    }


    @Override
    public void handle(ActionEvent event) {
        String email = "Blah@gmail.com";
        String pw = "Beepboop";
        if (field.getText().equals(email) && pwfield.getText().equals(pw)){
            System.out.println("Beep Boop");
        } else {
            field.clear();
            pwfield.clear();
            System.out.println("ERROR 404: Intelligence Not Found!");
        }

    }
}

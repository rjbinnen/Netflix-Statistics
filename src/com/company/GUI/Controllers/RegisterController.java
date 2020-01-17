package com.company.GUI.Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class RegisterController implements EventHandler<ActionEvent> {

    private TextField tfName;
    private TextField tfemail;
    private PasswordField pwmake;
    private PasswordField pwrepeat;
    private TextField strName;
    private TextField addition;
    private TextField resName;

    public RegisterController(TextField tfName, TextField tfemail, PasswordField pwmake, PasswordField pwrepeat, TextField strName, TextField addition, TextField resName) {
        this.tfName = tfName;
        this.tfemail = tfemail;
        this.pwmake = pwmake;
        this.pwrepeat = pwrepeat;
        this.strName = strName;
        this.addition = addition;
        this.resName = resName;
    }

    @Override
    public void handle(ActionEvent event) {
        String name = tfName.getText();
        String email = tfemail.getText();
        String pw = pwmake.getText();
        String pwr = pwrepeat.getText();
        String sName = strName.getText();
        String add = addition.getText();
        String rName = resName.getText();

        if (pw == pwr){
            System.out.println("Registration succesfull");
        } else {
            System.out.println("Can't you even remember a single password?");
        }
    }
}

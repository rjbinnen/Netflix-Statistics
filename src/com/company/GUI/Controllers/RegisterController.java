package com.company.GUI.Controllers;

import com.company.Domain.Account;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.regex.Pattern;


public class RegisterController implements EventHandler<ActionEvent> {

    private TextField tfName;
    private TextField tfemail;
    private PasswordField pwmake;
    private PasswordField pwrepeat;
    private TextField strName;
    private TextField addition;
    private TextField resName;
    private TextField hsNmbr;

    public RegisterController(TextField tfName, TextField tfemail, PasswordField pwmake, PasswordField pwrepeat, TextField strName, TextField hsNmbr, TextField addition, TextField resName) {
        this.tfName = tfName;
        this.tfemail = tfemail;
        this.pwmake = pwmake;
        this.pwrepeat = pwrepeat;
        this.strName = strName;
        this.addition = addition;
        this.resName = resName;
        this.hsNmbr = hsNmbr;
    }

    public void registerValidation() {
        //controleert input

        //Voornaam + Achternaam
        boolean nameOK = Pattern.matches("(\\b[A-Z]{1}[a-z]+)( )([A-Z]{1}[a-z]+\\b)", tfName.getText());

        //Password
        boolean passwordOK = pwmake.getLength() > 7;

        //Herhaalde password en controle
        boolean repeatOK = pwrepeat.getText().equals(pwmake.getText());

        //Straatnaam
        boolean streetOK = Pattern.matches("^[A-Z].*", strName.getText());

        //Huisnummer
        boolean numberOK = Pattern.matches("[0-9]+", hsNmbr.getText());

        //Woonplaats
        boolean cityOK = Pattern.matches("^[A-Z].*", resName.getText());

        //email
        boolean emailOK = Pattern.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", tfemail.getText());

        if (emailOK && cityOK && numberOK && streetOK && repeatOK && passwordOK && nameOK) {
            System.out.println("Registration successful");
            Account account = new Account(tfName.getText(), strName.getText(), Integer.parseInt(hsNmbr.getText()), addition.getText(), resName.getText(), null);
        }
    }


    @Override
    public void handle(ActionEvent event) {
        registerValidation();


    }
}

package com.company.GUI.Views;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class testView extends Application {
    @Override
    @SuppressWarnings("Duplicates")
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPaneSearchProgram = new GridPane();
        Scene searchProgramScene = new Scene(gridPaneSearchProgram);


        //Can search in all programs to select one to add to profile
        Button cancelButtonSearchProgram = new Button("Cancel");

        Label searchLabel = new Label("Search: ");
        Label programLabel = new Label("--ADD PROGRAMS HERE--");
        Label emptyLabelSearchProgram = new Label("");
        TextField searchTextField = new TextField();

        gridPaneSearchProgram.setMinSize(400, 200);
        gridPaneSearchProgram.setPadding(new Insets(10, 10, 10, 10));
        gridPaneSearchProgram.setVgap(5);
        gridPaneSearchProgram.setHgap(5);
        gridPaneSearchProgram.setAlignment(Pos.CENTER);

        gridPaneSearchProgram.add(searchLabel, 0, 0);
        gridPaneSearchProgram.add(searchTextField, 1, 0);
        gridPaneSearchProgram.add(programLabel, 0, 1);
        gridPaneSearchProgram.add(emptyLabelSearchProgram, 0, 2);
        gridPaneSearchProgram.add(cancelButtonSearchProgram, 0,3 );




        primaryStage.setTitle("Netflix Statistics - Search Programs");

        primaryStage.setScene(searchProgramScene);
        primaryStage.show();
    }
}

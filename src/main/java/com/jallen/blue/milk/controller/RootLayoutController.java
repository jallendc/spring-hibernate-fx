package com.jallen.blue.milk.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import com.jallen.blue.milk.Main;

public class RootLayoutController {

    //Exit the program
    public void handleExit(ActionEvent actionEvent) {
        System.exit(0);
    }

    //Help Menu button behavior
    public void handleHelp(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Program Information");
        alert.setHeaderText("This is a sample JAVAFX application");
        alert.setContentText("You can add an entry to a database.");
        alert.show();
    }
}

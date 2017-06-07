package com.netcracker.group6.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

/**
 * Created by darthMilash on 07.06.2017.
 */
public class RootWindowController   {

    @FXML
    public void handleAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Instant Messenger");
        alert.setHeaderText("About");
        alert.setContentText("Authors: \n2017");
        alert.showAndWait();
    }

    /**
     * Close app
     */
    @FXML
    public void handleExit() {
        System.exit(0);
    }
}

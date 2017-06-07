package com.netcracker.group6.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by darthMilash on 07.06.2017.
 */
public class ConnectWindowController {

    @FXML
    private TextField ip;
    @FXML
    private TextField port;

    private Stage dialogStage;

    public boolean isOkClicked() {
        return false;
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    @FXML
    public void handleConnect() {
        dialogStage.close();
    }

    @FXML
    public void handleCancel() {
        dialogStage.close();
    }
}

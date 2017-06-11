package com.netcracker.group6.controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by darthMilash on 11.06.2017.
 */
public class RegWindowController {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    private Stage dialogStage;

    public boolean isOkClicked() {
        return false;
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    @FXML
    public void handleReg() {
        dialogStage.close();
    }

    @FXML
    public void handleCancel() {
        dialogStage.close();
    }
}

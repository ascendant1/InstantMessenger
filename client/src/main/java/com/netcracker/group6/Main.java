package com.netcracker.group6;


import com.netcracker.group6.controller.ConnectWindowController;
import com.netcracker.group6.controller.LoginWindowController;
import com.netcracker.group6.controller.RegWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by darthMilash on 07.06.2017.
 */
public class Main extends Application {

    private static final Logger LOGGER = Logger.getLogger(Main.class);
    private static Stage primaryStage;
    private BorderPane rootLayout;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;
        Main.primaryStage.setTitle("Instant Messenger");

        initRootWindow();
        initConnectWindow();

//        this.primaryStage.getIcons().add(new Image("/images/icon.png"));

    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void initRootWindow() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/RootWindow.fxml"));
            rootLayout = (BorderPane) loader.load();

            Scene scene = new Scene(rootLayout);

            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            LOGGER.error("RootWindow data access error");
        }
    }

    public boolean initConnectWindow() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/ConnectWindow.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Connecting");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.setResizable(false);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            ConnectWindowController connectWindowController = loader.getController();
            connectWindowController.setDialogStage(dialogStage);
            dialogStage.showAndWait();


            return connectWindowController.isOkClicked();

        } catch (IOException e) {
            LOGGER.error("ConnectWindow data access error");
            return false;
        }
    }

    public boolean initRegWindow() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/RegWindow.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Registration");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.setResizable(false);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            RegWindowController regWindowController = loader.getController();
            regWindowController.setDialogStage(dialogStage);
            dialogStage.showAndWait();
            return regWindowController.isOkClicked();

        } catch (IOException e) {
            LOGGER.error("RegWindow data access error");
            return false;
        }
    }

    public boolean initLoginWindow() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/LoginWindow.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Authorization");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.setResizable(false);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            LoginWindowController loginWindowController = loader.getController();
            loginWindowController.setDialogStage(dialogStage);
            dialogStage.showAndWait();
            return loginWindowController.isOkClicked();

        } catch (IOException e) {
            LOGGER.error("LoginWindow data access error");
            return false;
        }
    }

}

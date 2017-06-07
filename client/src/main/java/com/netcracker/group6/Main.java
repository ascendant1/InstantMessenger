package com.netcracker.group6;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by darthMilash on 07.06.2017.
 */
public class Main extends Application {

    private static final Logger LOGGER = Logger.getLogger(Main.class);
    private Stage primaryStage;
    private BorderPane rootLayout;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Instant Messenger");

        initRootWindow();

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
}

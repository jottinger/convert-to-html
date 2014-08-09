package com.redhat.osas.utilities.conversion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ConvertToHTML extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/convert-to-html.fxml"));

        Scene scene = new Scene(root, 800, 675);

        stage.setTitle("Convert To HTML");
        stage.setScene(scene);
        stage.show();
    }
}
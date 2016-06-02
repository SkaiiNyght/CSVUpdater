/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ConfigurationButton;
import controller.UpdateButton;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Ag User
 */
public class Main {

    public static void Display(Stage window) {
        window.setOnCloseRequest(request -> {
            System.exit(0);
        });
        window.initStyle(StageStyle.UTILITY);
        window.setTitle("CSV Updater");
        /*==============================
        Background
        ==============================*/
        Pane background = new Pane();
        background.setMinSize(200, 75);

        /*==============================
        Layout
        ==============================*/
        GridPane layout = new GridPane();
        Pane leftPane = new Pane();
        leftPane.setMinSize(75, 90);
        GridPane.setConstraints(leftPane, 0, 0);
        Pane rightPane = new Pane();
        rightPane.setMinSize(75, 90);
        GridPane.setConstraints(rightPane, 1, 0);
        /*==============================
        Buttons
        ==============================*/
        Button btnUpdate = new Button("Update");
        btnUpdate.setLayoutY(35);
        btnUpdate.setLayoutX(5);
        btnUpdate.setOnAction(event -> {
            UpdateButton.onClick();
        });

        Button btnConfiguration = new Button("Configuration");
        btnConfiguration.setLayoutY(35);
        btnConfiguration.setLayoutX(20);
        btnConfiguration.setOnAction(event -> {
            ConfigurationButton.onClick();
        });

        /*==============================
        Add buttons to layout and background
        ==============================*/
        leftPane.getChildren().addAll(btnUpdate);
        rightPane.getChildren().addAll(btnConfiguration);
        layout.getChildren().addAll(leftPane, rightPane);
        background.getChildren().addAll(layout);

        /*==============================
        Add background to scene and display
        ==============================*/
        Scene scene = new Scene(background);
        window.setScene(scene);
        window.show();
    }
}

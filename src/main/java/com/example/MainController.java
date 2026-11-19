package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class MainController {
    @FXML 
    private StackPane rootPane;
    @FXML 
    private VBox titlePane;
    @FXML 
    private VBox gamePane;
    @FXML 
    private VBox resultPane;

    @FXML 
    private Button startButton;
    @FXML 
    private Button goResultButton;//仮のボタン
    @FXML 
    private Button backToTitleButton;

    @FXML
    private void initialize() {
        startButton.setOnAction(e -> {
            showGamePane();
        });
        goResultButton.setOnAction(e -> {
            showResultPane();
        });
        backToTitleButton.setOnAction(e -> {
            showTitlePane();
        });
    }

    private void showTitlePane() {
        titlePane.setVisible(true);
        gamePane.setVisible(false);
        resultPane.setVisible(false);
    }

    private void showGamePane() {
        titlePane.setVisible(false);
        gamePane.setVisible(true);
        resultPane.setVisible(false);
    }

    private void showResultPane() {
        titlePane.setVisible(false);
        gamePane.setVisible(false);
        resultPane.setVisible(true);
    }
}

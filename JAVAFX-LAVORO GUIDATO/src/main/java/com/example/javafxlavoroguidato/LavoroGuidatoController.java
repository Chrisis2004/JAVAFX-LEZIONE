package com.example.javafxlavoroguidato;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LavoroGuidatoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
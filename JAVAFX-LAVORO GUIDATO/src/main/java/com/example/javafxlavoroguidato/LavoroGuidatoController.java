package com.example.javafxlavoroguidato;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class LavoroGuidatoController {
    @FXML
    private Button button;
    @FXML
    private ImageView image;
    @FXML
    private CheckBox checkBox;
    @FXML
    private Label label;
    @FXML
    private Label label2;
    @FXML
    ListView<String> listView = new ListView<String>();
    @FXML
    private TextField textField;

    public void initialize() throws IOException {
        String[] stringDaStampare = new String[4];
        stringDaStampare[0] = "String per ListView n.1";
        stringDaStampare[1] = "String per ListView n.2";
        stringDaStampare[2] = "String per ListView n.3";
        stringDaStampare[3] = "String per ListView n.4";

        listView.getItems().addAll(stringDaStampare);
    }
    public void onButtonClick(){
        button.setStyle("-fx-background-color: blue");
    }
    public void onCheckBoxClick(){
        if (checkBox.isSelected())
            image.setVisible(true);
        else
            image.setVisible(false);
    }
    public void onLabelMouseOver(){
        label.setText("Sei passato qui sopra");
    }
    public void onLabelMouseClick(){
        label.setText("Mi hai cliccato");
    }
    public void onAddText() {
        label2.setText(textField.getText());
    }
}
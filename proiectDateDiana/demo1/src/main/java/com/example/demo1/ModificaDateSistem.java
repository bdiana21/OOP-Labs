package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ModificaDateSistem {

    @FXML
    private Button anuleazaMDS;

    public void setID(int id) {
    }
    public void cancelButtonOnAction(ActionEvent e){
        Stage stage= (Stage) anuleazaMDS.getScene().getWindow();
        stage.close();
    }
}

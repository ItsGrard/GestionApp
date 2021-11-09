package com.mycompany.gestionapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class ProfesorController {

    private void switchToPrimary() throws IOException {
        App.setRoot("LoginController");
    }

    @FXML
    private void logOutProfesor(MouseEvent event) {
        try {
            App.setRoot("loginVista");
        } catch (IOException ex) {
            System.out.println("Error al acceder al documento loginVista.fxml "+ex);;
        }
    }
}
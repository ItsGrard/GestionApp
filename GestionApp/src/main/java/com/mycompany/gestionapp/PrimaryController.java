package com.mycompany.gestionapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;

public class PrimaryController {

    @FXML
    private Label labelUsuario;
    @FXML
    private TextField txtUsuario;
    @FXML
    private Label labelContraseña;
    @FXML
    private PasswordField txtContraseña;
    @FXML
    private ImageView imgLogo;
    @FXML
    private ImageView imgUsuario;
    @FXML
    private ImageView imgContraseña;
    @FXML
    private CheckBox checkEsProfesor;
    @FXML
    private Button btnEntrar;
    @FXML
    private ImageView imgSalir;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void btnSalir(MouseEvent event) {
        //A través de la imagen cojo y le asigno a la variable la ventana donde esta situada
        Stage ventana = (Stage) imgSalir.getScene().getWindow();
        //Una vez tenemos la ventana asignada a una variable la cerramos.
        ventana.close();
        
    }
}

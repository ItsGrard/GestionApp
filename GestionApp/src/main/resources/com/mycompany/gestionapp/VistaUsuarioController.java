/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author marco
 */
public class VistaUsuarioController implements Initializable {

    @FXML
    private TextArea txtFecha;
    @FXML
    private TextArea txtHoras;
    @FXML
    private TextArea txtPractica;
    @FXML
    private TextArea txtActividad;
    @FXML
    private TextArea txtObservaciones;
    @FXML
    private Button btnEnviar;
    @FXML
    private Button btnCerrarSesion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

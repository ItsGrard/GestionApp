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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
/**
 * FXML Controller class
 *
 * @author marco
 */
public class AlumnoController implements Initializable {


    @FXML
    private Label labelNombreAlumno;
    @FXML
    private ImageView btnSalir;
    @FXML
    private TextField txtHorasTotales;
    @FXML
    private TextField txtTipoPractica;
    @FXML
    private DatePicker datePickerFecha;
    @FXML
    private TextArea txtActividad;
    @FXML
    private TextArea txtObservaciones;
    @FXML
    private Button btnAgregar;
    @FXML
    private TableView<?> tablaActividades;
    @FXML
    private TableColumn<?, ?> colId;
    @FXML
    private TableColumn<?, ?> colNombre;
    @FXML
    private TableColumn<?, ?> colNacimiento;
    @FXML
    private TableColumn<?, ?> colTelefono;
    @FXML
    private TableColumn<?, ?> colEmail;
    @FXML
    private TableColumn<?, ?> colClave;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      //Se le añade al Label el texto recogido de la variable globlar WhoIs de iniciar sesión
        labelNombreAlumno.setText(LoginController.whoIs);
//        listarEmpresas();
//        detectarClickMouse();
    }    
    
    @FXML
    private void logOutProfesor(MouseEvent event) {
    }

    @FXML
    private void agregarAlumno(MouseEvent event) {
    }

}

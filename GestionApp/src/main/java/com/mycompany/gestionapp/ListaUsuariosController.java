package com.mycompany.gestionapp;

import Datos.HibernateUtil;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelos.Alumno;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
public class ListaUsuariosController implements Initializable {

    @FXML
    private TableView<Alumno> tablaUsuarios;
    @FXML
    private TableColumn<Alumno, Long> colId;
    @FXML
    private TableColumn<Alumno, String> colDNI;
    @FXML
    private TableColumn<Alumno, String> colNombre;
    @FXML
    private TableColumn<Alumno, String> colApellidos;
    @FXML
    private TableColumn<Alumno, Integer> colTelefono;
    @FXML
    private TableColumn<Alumno, String> colEmail;
    @FXML
    private TableColumn<Alumno, Date> colFechaNacimiento;
    @FXML
    private TableColumn<Alumno, Integer> colHorasDual;
    @FXML
    private TableColumn<Alumno, Integer> colHorasFCT;
    @FXML
    private TableColumn<Alumno, String> colClave;
    @FXML
    private TableColumn<Alumno, String> colObservaciones;
    @FXML
    private TableColumn<Alumno, Integer> colEmpresa;
    @FXML
    private TableColumn<Alumno, Integer> colProfesor;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        Query q = s.createQuery("FROM Alumnos");
        ObservableList<Alumno> contenidoPedido = FXCollections.observableArrayList();
        tablaUsuarios.setItems(contenidoPedido);
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colDNI.setCellValueFactory(new PropertyValueFactory<>("dni"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colFechaNacimiento.setCellValueFactory(new PropertyValueFactory<>("fecha_nacimiento"));
        colHorasDual.setCellValueFactory(new PropertyValueFactory<>("horas_dual"));
        colHorasFCT.setCellValueFactory(new PropertyValueFactory<>("horas_fct"));
        colClave.setCellValueFactory(new PropertyValueFactory<>("clave"));
        colObservaciones.setCellValueFactory(new PropertyValueFactory<>("observaciones"));
        colEmpresa.setCellValueFactory(new PropertyValueFactory<>("empresa_id"));
        colProfesor.setCellValueFactory(new PropertyValueFactory<>("profesor_id"));
        ArrayList<Alumno> alumnos = (ArrayList<Alumno>) q.list();
        alumnos.addAll(alumnos);
        
    }    
    
}

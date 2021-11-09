package com.mycompany.gestionapp;

import Datos.HibernateUtil;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import modelos.Alumno;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ProfesorController implements Initializable {

    @FXML
    private Label labelNombreProfesor;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtDNI;
    @FXML
    private TextField txtFechaNacimiento;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtEmpresa;
    @FXML
    private TextField txtTutor;
    @FXML
    private TextField txtHorasDuales;
    @FXML
    private TextField txtHorasFCT;
    @FXML
    private TextArea txtObservaciones;
    @FXML
    private Button btnAgregar;
    @FXML
    private TableView<Alumno> tablaAlumnos;
    @FXML
    private TableColumn<Alumno, Long> colId;
    @FXML
    private TableColumn<Alumno, String> colDNI;
    @FXML
    private TableColumn<Alumno, String> colNombre;
    @FXML
    private TableColumn<Alumno, String> colApellidos;
    @FXML
    private TableColumn<Alumno, Date> colNacimiento;
    @FXML
    private TableColumn<Alumno, Integer> colTelefono;
    @FXML
    private TableColumn<Alumno, String> colEmail;
    @FXML
    private TableColumn<Alumno, String> colClave;
    @FXML
    private TableColumn<Alumno, Integer> colHorasDual;
    @FXML
    private TableColumn<Alumno, Integer> colHorasFCT;
    @FXML
    private TableColumn<Alumno, Integer> colEmpresa;
    @FXML
    private TableColumn<Alumno, Integer> colProfesor;
    @FXML
    private TableColumn<Alumno, String> colObservaciones;

    private void switchToPrimary() throws IOException {
        App.setRoot("LoginController");
    }

    @FXML
    private void logOutProfesor(MouseEvent event) {
        try {
            App.setRoot("loginVista");
        } catch (IOException ex) {
            System.out.println("Error al acceder al documento loginVista.fxml " + ex);;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listarAlumnos();

    }
    
    public void listarAlumnos(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        ObservableList<Alumno> alumnosObservable = FXCollections.observableArrayList();
        tablaAlumnos.setItems(alumnosObservable);
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colDNI.setCellValueFactory(new PropertyValueFactory<>("dni"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        colNacimiento.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colClave.setCellValueFactory(new PropertyValueFactory<>("clave"));
        colHorasDual.setCellValueFactory(new PropertyValueFactory<>("horasDual"));
        colHorasFCT.setCellValueFactory(new PropertyValueFactory<>("horasFCT"));
        colEmpresa.setCellValueFactory(new PropertyValueFactory<>("empresa"));
        colProfesor.setCellValueFactory(new PropertyValueFactory<>("profesor"));
        colObservaciones.setCellValueFactory(new PropertyValueFactory<>("observaciones"));
        Query q = s.createQuery("FROM Alumno");
        ArrayList<Alumno> alumnos = (ArrayList<Alumno>) q.list();
        alumnosObservable.addAll(alumnos);
        t.commit();
    }
    
    public void insertarAlumno(){
        //Método que lista los alumnos de la tabla "Alumnos"
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        String dni = txtDNI.getText();
        String nombre = txtDNI.getText();
        String apellidos = txtDNI.getText();
        String fechaNacimiento = txtDNI.getText();
        String telefono = txtDNI.getText();
        String email = txtDNI.getText();
        String clave = txtDNI.getText();
        String horasDual = txtDNI.getText();
        String horasFCT = txtDNI.getText();
        String observaciones = txtDNI.getText();
        String empresa = txtDNI.getText();
        String profesor = txtDNI.getText();
        Alumno alumno = new Alumno();
        alumno.setDni(dni);
        alumno.setNombre(nombre);
        alumno.setApellidos(apellidos);
        alumno.setFechaNacimiento(new Date(fechaNacimiento));
        alumno.setTelefono(Integer.parseInt(telefono));
        alumno.setEmail(email);
        alumno.setClave(clave);
        alumno.setHorasDual(Integer.parseInt(horasDual));
        alumno.setHorasFCT(Integer.parseInt(horasFCT));
        alumno.setObservaciones(observaciones);
       //alumno.setEmpresa(empresa);
       //alumno.setProfesor(profesor);
        
        //QUEDA POR TERMINARLO
    }
}

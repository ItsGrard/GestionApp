module com.mycompany.gestionapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.gestionapp to javafx.fxml;
    exports com.mycompany.gestionapp;
}

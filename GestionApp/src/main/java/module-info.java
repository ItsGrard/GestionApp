module com.mycompany.gestionapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.gestionapp to javafx.fxml;
    exports com.mycompany.gestionapp;
}

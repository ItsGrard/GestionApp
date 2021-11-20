package com.mycompany.gestionapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //Para programar vuestra vista y ver resultados teneis que cambiar aqui el nombre
        scene = new Scene(loadFXML("loginVista"), 1680, 750);
        stage.setScene(scene);
        stage.show();
        
        //Listener para controlar que el usuario no reduzca la anchura menor a 343px
        stage.widthProperty().addListener((o, oldValue, newValue) -> {
            if (newValue.intValue() < 343.0) {
                //No deja poner la ventana mas pequeña
                stage.setResizable(false);
                //A continuación pone la ventana a 343px
                stage.setWidth(343.0);
                //Una vez esta a 343 se puede modificar el tamaño
                stage.setResizable(true);
            }
        });
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
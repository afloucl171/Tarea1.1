package com.example.ejemplohyperlink;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class EjemploHyperlink extends Application {

    /*@Override
    public void start(Stage primaryStage) {
        //Ponemos el texto que se mostrara por pantalla a la hora de ejecutar el programa
        //y se le añaden algunas caracteristicas al texto.
        Label hyperlink = new Label("Visita Moodle");
        hyperlink.setStyle("-fx-text-fill: blue; -fx-underline: true;");

        hyperlink.setOnMouseClicked(event -> {
            try { //Dentro del try añadimos el utl del lugar a ir para asi si hay algun fallo no se completo del programa.
                Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=moodle"));//esta linea obliga a que la pagina se abra con google.
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        // Creamos u vbox y un scean
        VBox root = new VBox(hyperlink);
        Scene scene = new Scene(root, 300, 200);
        //Se le añaade el titulo y se selecciona la escena correcta.
        primaryStage.setTitle("Hyperlink Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Creamos el metodo para poder lanzar el enlace.
    public static void main(String[] args) {
        launch(args);
    }*/

    //Este codigo es para solo usar google y firefox
    @Override
    public void start(Stage primaryStage) {

        //Creamos dos botones para seleccionar el tipo de navegador.
        Button chromeButton = new Button("Abrir en Google Chrome");
        Button firefoxButton = new Button("Abrir en Firefox");

        //Añadimos las rutas desde google y desde firefox.
        chromeButton.setOnAction(event -> openInBrowser("chrome", "https://www.google.com/search?q=moodle"));
        firefoxButton.setOnAction(event -> openInBrowser("firefox", "https://www.google.com/search?q=moodle"));

        VBox root = new VBox(10, chromeButton, firefoxButton);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Abrir en Varios Navegadores");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openInBrowser(String browser, String url) {
        try {
            //Se añade este metodo porque dependiendo del boton pulsado abre un navegador u otro.
            //Se añade el try para asi si hay algun fallo no se completo del programa.
            String command = "";
            if (browser.equals("chrome")) {
                command = "cmd /c start chrome " + url; // Windows
            } else if (browser.equals("firefox")) {
                command = "cmd /c start firefox " + url; // Windows
            }

            if (!command.isEmpty()) {
                Runtime.getRuntime().exec(command);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Este metodo se le añade para poder lanzar el programa.
    public static void main(String[] args) {
        launch(args);
    }
}



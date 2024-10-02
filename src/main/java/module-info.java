module com.example.ejemplohyperlink {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.ejemplohyperlink to javafx.fxml;
    exports com.example.ejemplohyperlink;
}
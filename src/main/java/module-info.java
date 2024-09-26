module com.example.ejemplohyperlink {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplohyperlink to javafx.fxml;
    exports com.example.ejemplohyperlink;
}
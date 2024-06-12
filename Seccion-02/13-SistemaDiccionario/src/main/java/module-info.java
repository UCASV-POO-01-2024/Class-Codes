module com.example.sistemadiccionario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.sistemadiccionario to javafx.fxml;
    exports com.example.sistemadiccionario;
}
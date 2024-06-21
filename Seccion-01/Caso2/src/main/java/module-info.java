module org.examples.caso2 {
    requires javafx.controls;
    requires javafx.fxml;


    exports org.examples.caso2.gui.viewers;
    opens org.examples.caso2.gui.viewers to javafx.fxml;
    exports org.examples.caso2.gui.controllers;
    opens org.examples.caso2.gui.controllers to javafx.fxml;
    exports org.examples.caso2.model;
    opens org.examples.caso2.model to javafx.fxml;
    exports org.examples.caso2.model.dicto;
    opens org.examples.caso2.model.dicto to javafx.fxml;
}
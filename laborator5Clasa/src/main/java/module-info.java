module ro.mpp.lab5clasa.laborator5clasa {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;
    requires java.sql;
    requires spring.context;


    opens ro.mpp.lab5clasa.laborator5clasa to javafx.fxml;
    exports ro.mpp.lab5clasa.laborator5clasa;
}
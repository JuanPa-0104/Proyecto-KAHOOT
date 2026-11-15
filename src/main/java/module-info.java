module proyecto.java {
    requires javafx.controls;
    requires javafx.fxml;

    // FXML necesita acceso por reflexión a los controladores
    opens com.proyecto to javafx.fxml;

    exports com.proyecto;
}

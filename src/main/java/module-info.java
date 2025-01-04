module com.leo.application.departmentcrudjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;

    opens com.leo.application.departmentcrudjavafx to javafx.fxml;
    opens com.leo.gui to javafx.fxml;
    opens com.leo.controllers to javafx.fxml;
    opens com.leo.entities to javafx.base;


    exports com.leo.application.departmentcrudjavafx;
}

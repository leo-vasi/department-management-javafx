module com.leo.application.departmentcrudjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.leo.application.departmentcrudjavafx to javafx.fxml;
    opens com.leo.gui to javafx.fxml;
    opens com.leo.controllers to javafx.fxml;

    exports com.leo.application.departmentcrudjavafx;
}

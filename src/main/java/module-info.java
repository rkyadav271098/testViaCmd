module com.example.testviacmd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testviacmd to javafx.fxml;
    exports com.example.testviacmd;
}